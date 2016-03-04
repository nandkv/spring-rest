package com.spring.app.domain.patient.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.spring.app.persistence.model.patient.Patient;

@Mapper
public interface PatientMapper {
	PatientMapper INSTANCE = Mappers.getMapper( PatientMapper.class); 
    
    @Mappings({
        @Mapping(source = "name", target = "name"),
        @Mapping(source = "userid", target = "userid")
    })
    com.spring.app.domain.patient.Patient patientToPatient(Patient patient); 
}

