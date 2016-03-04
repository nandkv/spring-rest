package com.spring.app.service.dto.patient.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.spring.app.domain.patient.mapper.MedicationMapper;
import com.spring.app.domain.patient.mapper.PatientMapper;
import com.spring.app.persistence.model.patient.Patient;
import com.spring.app.service.dto.patient.PatientResponseDTO;

@Mapper(uses={PatientMapper.class, MedicationMapper.class})
public interface PatientDTOMapper {
	PatientDTOMapper INSTANCE = Mappers.getMapper( PatientDTOMapper.class); 
    
    @Mappings({
        @Mapping(source = "patient", target = "patient"),
        @Mapping(source = "patient.medications", target = "medications")        
    })
    PatientResponseDTO patientToPatientResponseDto(Patient patient); 
}
