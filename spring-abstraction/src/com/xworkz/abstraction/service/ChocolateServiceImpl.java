package com.xworkz.abstraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.ChocolateDTO;
import com.xworkz.abstraction.repository.ChocolateRepository;

@Component
public class ChocolateServiceImpl implements ChocolateService {

	@Autowired
	@Qualifier("chocoRepository")
	private ChocolateRepository choco;
	
	@Override
	public boolean validateAndSave(ChocolateDTO dto) {
		System.out.println("running validate using Chocolate");
		return choco.save(dto);
	}

}
