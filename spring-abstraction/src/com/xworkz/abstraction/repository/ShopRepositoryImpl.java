package com.xworkz.abstraction.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.ShopDTO;

@Component
public class ShopRepositoryImpl implements ShopRepository {

	@Override
	public boolean save(ShopDTO dto) {
		System.out.println(dto);
		return false;
	}

}
