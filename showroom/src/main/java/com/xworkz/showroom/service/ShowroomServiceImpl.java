package com.xworkz.showroom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.ShowroomDTO;
import com.xworkz.showroom.repository.ShowroomRepository;

@Component
public class ShowroomServiceImpl implements ShowroomService {

	@Autowired
	private ShowroomRepository repo;
	
	@Override
	public boolean validateAndSave(ShowroomDTO dto) {
		System.out.println("Service method");
		return repo.save(dto);
	}

}
