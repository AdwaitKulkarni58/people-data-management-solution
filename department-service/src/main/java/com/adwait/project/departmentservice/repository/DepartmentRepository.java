package com.adwait.project.departmentservice.repository;

import com.adwait.project.departmentservice.entity.*;
import org.springframework.data.jpa.repository.*;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findByDepartmentCode(String departmentCode);
}
