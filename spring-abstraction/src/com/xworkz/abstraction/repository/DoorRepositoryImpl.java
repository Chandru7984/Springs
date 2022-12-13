package com.xworkz.abstraction.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.DoorDTO;

@Component
public class DoorRepositoryImpl implements DoorRepository {

	@Override
	public boolean save(DoorDTO dto) {
		System.out.println(dto);
		return false;
	}

}
