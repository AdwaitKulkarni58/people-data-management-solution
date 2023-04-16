package com.adwait.project.employeeservice.service.impl;

import com.adwait.project.employeeservice.dto.*;
import com.adwait.project.employeeservice.entity.*;
import com.adwait.project.employeeservice.repository.*;
import com.adwait.project.employeeservice.service.*;
import lombok.*;
import org.modelmapper.*;
import org.springframework.stereotype.*;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    private ModelMapper modelMapper;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = modelMapper.map(employeeDto, Employee.class);
        Employee savedEmployee = employeeRepository.save(employee);
        return modelMapper.map(savedEmployee, EmployeeDto.class);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).get();
        return modelMapper.map(employee, EmployeeDto.class);
    }
}
