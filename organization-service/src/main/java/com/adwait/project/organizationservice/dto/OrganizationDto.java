package com.adwait.project.organizationservice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationDto {

    private Long id;
    private String organizationName;
    private String organizationDescription;
    private String organizationCode;
}
