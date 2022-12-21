package com.xworkz.patient.service;

import com.xworkz.patient.dto.PatientDTO;

public interface PatientService {
	
	boolean validateAndSave(PatientDTO dto);

}
