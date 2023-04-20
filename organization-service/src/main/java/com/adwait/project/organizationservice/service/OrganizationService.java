package com.adwait.project.organizationservice.service;

import com.adwait.project.organizationservice.dto.*;

public interface OrganizationService {

    OrganizationDto saveOrganization(OrganizationDto organizationDto);

    OrganizationDto getOrganizationByCode(String organizationCode);
}
