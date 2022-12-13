package com.xworkz.abstraction.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.ChocolateDTO;

@Component
public class ChocolateRepositoryImpl implements ChocolateRepository {

	@Override
	public boolean save(ChocolateDTO dto) {
		System.out.println(dto);
		return false;
	}

}
