package net.javaguide.organizationservice.service;

import lombok.AllArgsConstructor;
import net.javaguide.organizationservice.dto.OrganizationDto;
import net.javaguide.organizationservice.entity.Organization;
import net.javaguide.organizationservice.mapper.OrganizationMapper;
import net.javaguide.organizationservice.respository.OrganizationRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl {

    private OrganizationRepository organizationRepository;

    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {

        // convert OrganizationDto into Organization jpa entity
        Organization organization = OrganizationMapper.mapToOrganization(organizationDto);

        Organization savedOrganization = organizationRepository.save(organization);

        return OrganizationMapper.mapToOrganizationDto(savedOrganization);
    }

    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
        return OrganizationMapper.mapToOrganizationDto(organization);
    }
}
