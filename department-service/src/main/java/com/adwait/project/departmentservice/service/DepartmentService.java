package com.adwait.project.departmentservice.service;

import com.adwait.project.departmentservice.dto.*;

public interface DepartmentService {

    public DepartmentDto saveDepartment(DepartmentDto departmentDto);

    public DepartmentDto getDepartmentByCode(String code);
}
