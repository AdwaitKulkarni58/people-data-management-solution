package com.adwait.project.organizationservice.repository;

import com.adwait.project.organizationservice.entity.*;
import org.springframework.data.jpa.repository.*;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {

    Organization findByOrganizationCode(String organizationCode);
}
