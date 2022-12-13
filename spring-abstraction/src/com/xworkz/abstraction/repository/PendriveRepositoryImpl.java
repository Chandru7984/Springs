package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.dto.PendriveDTO;

public class PendriveRepositoryImpl implements PendriveRepository {

	@Override
	public boolean save(PendriveDTO dto) {
		System.out.println(dto);
		return false;
	}

}
