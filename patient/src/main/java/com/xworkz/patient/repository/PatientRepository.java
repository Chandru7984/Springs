package com.xworkz.patient.repository;

import java.util.List;
import java.util.Optional;

import com.xworkz.patient.dto.PatientDTO;

public interface PatientRepository {
	
	boolean save(PatientDTO dto);
	
	Optional<List<PatientDTO>> findByName(String name);
	
	Optional<List<PatientDTO>> findAgeGreaterThan(int age);
	
	List<PatientDTO> findByEmail(String email);

	List<PatientDTO> findByMobile(long mobileNo);
}
