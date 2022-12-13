package com.xworkz.abstraction.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.MobileDTO;

@Component
public class MobileRepositoryImpl implements MobileRepository {

	@Override
	public boolean save(MobileDTO dto) {
		System.out.println(dto);
		return false;
	}

}
