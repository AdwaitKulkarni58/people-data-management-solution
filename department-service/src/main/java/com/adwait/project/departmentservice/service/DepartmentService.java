package com.adwait.project.departmentservice.service;

import com.adwait.project.departmentservice.dto.*;

public interface DepartmentService {

    DepartmentDto saveDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepartmentByCode(String code);
}
