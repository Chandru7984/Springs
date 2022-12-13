package com.xworkz.abstraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.HomeDTO;
import com.xworkz.abstraction.repository.HomeRepository;

@Component
public class HomeServiceImpl implements HomeService {

	@Autowired
	@Qualifier("homeRepository")
	private HomeRepository home;
	
	@Override
	public boolean validateAndSave(HomeDTO dto) {
		System.out.println("Running validate using save");
		return false;
	}

}
