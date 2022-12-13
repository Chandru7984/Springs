package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.dto.ChairDTO;

public class ChairRepositoryImpl implements ChairRepository {

	@Override
	public boolean save(ChairDTO dto) {
		System.out.println(dto);
		return false;
	}

}
