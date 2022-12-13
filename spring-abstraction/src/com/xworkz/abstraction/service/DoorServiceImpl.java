package com.xworkz.abstraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.DoorDTO;
import com.xworkz.abstraction.repository.DoorRepository;

@Component
public class DoorServiceImpl implements DoorService {

	@Autowired
	@Qualifier("doorRepository")
	private DoorRepository door;
	
	@Override
	public boolean validateAndSave(DoorDTO dto) {
		System.out.println("running validate using door");
		return door.save(dto);
	}

}
