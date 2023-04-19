package com.adwait.project.employeeservice.service;

import com.adwait.project.employeeservice.dto.*;

public interface EmployeeService {

    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);

}
