package com.xworkz.abstraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.SwitchDTO;
import com.xworkz.abstraction.repository.SwitchRepository;

@Component
public class SwitchServiceImpl implements SwitchService {

	@Autowired
	@Qualifier("switchRepository")
	private SwitchRepository switchRepo;
	
	@Override
	public boolean validateAndSave(SwitchDTO dto) {
		System.out.println("running validate using switch");
		return switchRepo.save(dto);
	}

}
