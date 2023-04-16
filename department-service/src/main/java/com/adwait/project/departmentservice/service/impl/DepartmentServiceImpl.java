package com.adwait.project.departmentservice.service.impl;

import com.adwait.project.departmentservice.dto.*;
import com.adwait.project.departmentservice.entity.*;
import com.adwait.project.departmentservice.repository.*;
import com.adwait.project.departmentservice.service.*;
import lombok.*;
import org.modelmapper.*;
import org.springframework.stereotype.*;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private ModelMapper modelMapper;

    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        Department department = modelMapper.map(departmentDto, Department.class);
        Department savedDepartment = departmentRepository.save(department);
        return modelMapper.map(savedDepartment, DepartmentDto.class);
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {
        Department department = departmentRepository.findByDepartmentCode(departmentCode);
        return modelMapper.map(department, DepartmentDto.class);
    }
}
