package com.xworkz.abstraction.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.ATMDTO;

@Component
public class ATMRepositoryImpl implements ATMRepository {

	@Override
	public boolean save(ATMDTO dto) {
		System.out.println(dto);
		return true;
	}

}
