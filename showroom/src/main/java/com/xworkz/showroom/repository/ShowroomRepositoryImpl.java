package com.xworkz.showroom.repository;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.ShowroomDTO;

@Component
public class ShowroomRepositoryImpl implements ShowroomRepository {

	@Override
	public boolean save(ShowroomDTO dto) {
		System.out.println("Repository method");
		return true;
	}

}
