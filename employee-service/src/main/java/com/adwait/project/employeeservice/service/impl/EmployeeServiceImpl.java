package com.adwait.project.employeeservice.service.impl;

import com.adwait.project.employeeservice.dto.*;
import com.adwait.project.employeeservice.entity.*;
import com.adwait.project.employeeservice.repository.*;
import com.adwait.project.employeeservice.service.*;
import io.github.resilience4j.circuitbreaker.annotation.*;
import lombok.*;
import org.modelmapper.*;
import org.springframework.stereotype.*;
import org.springframework.web.reactive.function.client.*;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    // private RestTemplate restTemplate;

    private WebClient webClient;

    private ModelMapper modelMapper;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = modelMapper.map(employeeDto, Employee.class);
        Employee savedEmployee = employeeRepository.save(employee);
        return modelMapper.map(savedEmployee, EmployeeDto.class);
    }

    @CircuitBreaker(name = "${spring.application.name}", fallbackMethod = "getDepartmentDefault")
    @Override
    public APIResponseDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).get();
        DepartmentDto departmentDto = webClient.get()
                .uri("http://localhost:8080/api/departments/" + employee.getDepartmentCode())
                .retrieve()
                .bodyToMono(DepartmentDto.class)
                .block();
        EmployeeDto employeeDto = modelMapper.map(employee, EmployeeDto.class);
        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setEmployeeDto(employeeDto);
        apiResponseDto.setDepartmentDto(departmentDto);
        return apiResponseDto;
    }

    public APIResponseDto getDepartmentDefault(Long employeeId, Exception e) {
        Employee employee = employeeRepository.findById(employeeId).get();
        DepartmentDto departmentDto = new DepartmentDto();
        departmentDto.setDepartmentName("R and D");
        departmentDto.setDepartmentCode("RD");
        departmentDto.setDepartmentDescription("This is the R&D department");
        EmployeeDto employeeDto = modelMapper.map(employee, EmployeeDto.class);
        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setEmployeeDto(employeeDto);
        apiResponseDto.setDepartmentDto(departmentDto);
        return apiResponseDto;
    }
}
