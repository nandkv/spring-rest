package com.spring.rest.domain.patient.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.spring.rest.model.patient.Patient;

@Mapper
public interface PatientMapper {
	PatientMapper INSTANCE = Mappers.getMapper( PatientMapper.class); 
    
    @Mappings({
        @Mapping(source = "name", target = "name"),
        @Mapping(source = "userid", target = "userid")
    })
    com.spring.rest.domain.patient.Patient patientToPatient(Patient patient); 
}

