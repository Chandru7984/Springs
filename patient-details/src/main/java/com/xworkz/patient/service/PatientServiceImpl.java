package com.xworkz.patient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.patient.dto.PatientDTO;
import com.xworkz.patient.repository.PatientRepository;

@Component
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository repo;
	
	@Override
	public boolean validateAndSave(PatientDTO dto) {
		return repo.save(dto);
	}

}
