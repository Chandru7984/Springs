package com.xworkz.abstraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.ShopDTO;
import com.xworkz.abstraction.repository.ShopRepository;

@Component
public class ShopServiceImpl implements ShopService {

	@Autowired
	@Qualifier("shopRepository")
	private ShopRepository shop;
	
	@Override
	public boolean validateAndSave(ShopDTO dto) {
		System.out.println("running validate using shop");
		return false;
	}

}
