package com.xworkz.abstraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.ATMDTO;
import com.xworkz.abstraction.repository.ATMRepository;
import com.xworkz.abstraction.repository.ATMRepositoryImpl;

@Component
public class ATMServiceImpl implements ATMService {

	@Autowired
	@Qualifier("atmRepository")
	private ATMRepository atmRepository;
	
	@Override
	public boolean validateAndSave(ATMDTO dto) {
		System.out.println("Running validate and save");
		return atmRepository.save(dto);
	}

}
