package com.xworkz.patient.repository;

import com.xworkz.patient.dto.PatientDTO;

public interface PatientRepository {
	
	boolean save(PatientDTO dto);

}
