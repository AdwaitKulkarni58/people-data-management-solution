package com.adwait.project.organizationservice.service.impl;

import com.adwait.project.organizationservice.dto.*;
import com.adwait.project.organizationservice.entity.*;
import com.adwait.project.organizationservice.repository.*;
import com.adwait.project.organizationservice.service.*;
import lombok.*;
import org.modelmapper.*;
import org.springframework.stereotype.*;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl  implements OrganizationService {

    private OrganizationRepository organizationRepository;

    private ModelMapper modelMapper;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {
        Organization organization = modelMapper.map(organizationDto, Organization.class);
        Organization savedOrganization = organizationRepository.save(organization);
        return modelMapper.map(savedOrganization, OrganizationDto.class);
    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
        return modelMapper.map(organization, OrganizationDto.class);
    }
}
