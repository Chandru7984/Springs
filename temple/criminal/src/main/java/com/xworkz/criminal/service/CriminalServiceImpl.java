package com.xworkz.criminal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.criminal.dto.CriminalDTO;
import com.xworkz.criminal.repository.CriminalRepository;

@Component
public class CriminalServiceImpl implements CriminalService {

	@Autowired
	private CriminalRepository repo;

	@Override
	public boolean validateAndSave(CriminalDTO dto) {
		return repo.save(dto);
	}

	@Override
	public Optional<List<CriminalDTO>> findByName(String name,String jailName) {
		return repo.findByName(name, jailName);
	}

//	@Override
//	public Optional<List<CriminalDTO>> findByJailName(String jailName) {
//		return repo.findByJailName(jailName);
//	}

}
