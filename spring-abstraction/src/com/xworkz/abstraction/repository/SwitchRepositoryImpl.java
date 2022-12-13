package com.xworkz.abstraction.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.SwitchDTO;

@Component
public class SwitchRepositoryImpl implements SwitchRepository {

	@Override
	public boolean save(SwitchDTO dto) {
		System.out.println(dto);
		return false;
	}

}
