package com.spring.app.domain.patient.mapper;

import org.mapstruct.Mapper;

import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.spring.app.persistence.model.patient.Medication;

@Mapper
public interface MedicationMapper {
	MedicationMapper INSTANCE = Mappers.getMapper( MedicationMapper.class); 
    
    @Mappings({
        @Mapping(source = "name", target = "name"),
        @Mapping(source = "instructions", target = "instructions")
    })
    com.spring.app.domain.patient.Medication medicationToMedication(Medication medication); 
}
