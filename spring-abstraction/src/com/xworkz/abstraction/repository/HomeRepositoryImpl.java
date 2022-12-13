package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.dto.HomeDTO;

public class HomeRepositoryImpl implements HomeRepository {

	@Override
	public boolean save(HomeDTO dto) {
		System.out.println(dto);
		return false;
	}

}
