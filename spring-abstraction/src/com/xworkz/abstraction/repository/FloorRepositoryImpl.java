package com.xworkz.abstraction.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.FloorDTO;

@Component
public class FloorRepositoryImpl implements FloorRepository {

	@Override
	public boolean save(FloorDTO dto) {
		System.out.println(dto);
		return false;
	}

}
