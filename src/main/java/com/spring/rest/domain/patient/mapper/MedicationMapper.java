package com.spring.rest.domain.patient.mapper;

import org.mapstruct.Mapper;

import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.spring.rest.model.patient.Medication;

@Mapper
public interface MedicationMapper {
	MedicationMapper INSTANCE = Mappers.getMapper( MedicationMapper.class); 
    
    @Mappings({
        @Mapping(source = "name", target = "name"),
        @Mapping(source = "instructions", target = "instructions")
    })
    com.spring.rest.domain.patient.Medication medicationToMedication(Medication medication); 
}
