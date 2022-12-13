package com.xworkz.abstraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.MobileDTO;
import com.xworkz.abstraction.repository.MobileRepository;

@Component
public class MobileServiceImpl implements MobileService {

	@Autowired
	@Qualifier("mobileRepository")
	private MobileRepository mobile;
	
	@Override
	public boolean validateAndSave(MobileDTO dto) {
		System.out.println("running validate using mobile");
		return mobile.save(dto);
	}

}
