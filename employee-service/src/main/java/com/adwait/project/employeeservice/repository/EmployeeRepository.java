package com.adwait.project.employeeservice.repository;

import com.adwait.project.employeeservice.entity.*;
import org.springframework.data.jpa.repository.*;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
