package com.spring.rest.dto.patient.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.spring.rest.domain.patient.mapper.MedicationMapper;
import com.spring.rest.domain.patient.mapper.PatientMapper;
import com.spring.rest.dto.patient.PatientResponseDTO;
import com.spring.rest.model.patient.Patient;

@Mapper(uses={PatientMapper.class, MedicationMapper.class})
public interface PatientDTOMapper {
	PatientDTOMapper INSTANCE = Mappers.getMapper( PatientDTOMapper.class); 
    
    @Mappings({
        @Mapping(source = "patient", target = "patient"),
        @Mapping(source = "patient.medications", target = "medications")        
    })
    PatientResponseDTO patientToPatientResponseDto(Patient patient); 
}
