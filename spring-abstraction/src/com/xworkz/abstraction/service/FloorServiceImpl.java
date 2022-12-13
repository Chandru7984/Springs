package com.xworkz.abstraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.FloorDTO;
import com.xworkz.abstraction.repository.FloorRepository;

@Component
public class FloorServiceImpl implements FloorService {

	@Autowired
	@Qualifier("floorRepository")
	private FloorRepository floor;
	
	@Override
	public boolean validateAndSave(FloorDTO dto) {
		System.out.println("Running validate using save");
		return floor.save(dto);
	}

}
