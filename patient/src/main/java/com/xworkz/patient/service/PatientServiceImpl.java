package com.xworkz.patient.service;

import java.util.List;
import java.util.Optional;

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
		System.out.println("Validate method");
		return repo.save(dto);
	}

	@Override
	public Optional<List<PatientDTO>> findByName(String name) {
		return repo.findByName(name);
	}

	@Override
	public Optional<List<PatientDTO>> findAgeGreaterThan(int age) {
		if (age > 20) {
			System.out.println("Age is Displayed greater than 20");
			return repo.findAgeGreaterThan(age);
		} else {
			System.out.println("Age is not Valid");
			return Optional.empty();
		}

	}

	@Override
	public boolean findByEmail(String email) {
		List<PatientDTO> findByEmail = repo.findByEmail(email);
		if (findByEmail != null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean findByMobile(long mobileNo) {
		List<PatientDTO> findByMobile = repo.findByMobile(mobileNo);
		if (findByMobile != null) {
			return false;
		} else {
			return true;
		}
	}

}
