package com.xworkz.abstraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.ChairDTO;
import com.xworkz.abstraction.repository.ChairRepository;

@Component
public class ChairServiceImpl implements ChairService {

	@Autowired
	@Qualifier("chairRepository")
	private ChairRepository chair;
	
	@Override
	public boolean validateAndSave(ChairDTO dto) {
		System.out.println("Running validate using chair");
		return chair.save(dto);
	}

}
