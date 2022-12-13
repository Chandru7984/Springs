package com.xworkz.abstraction.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.WatchDTO;

@Component
public class WatchRepositoryImpl implements WatchRepository {

	@Override
	public boolean save(WatchDTO dto) {
		System.out.println(dto);
		return false;
	}

}
