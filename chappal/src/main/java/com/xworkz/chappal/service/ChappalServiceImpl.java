package com.xworkz.chappal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.chappal.dto.ChappalDTO;
import com.xworkz.chappal.repository.ChappalRepository;

@Component
public class ChappalServiceImpl implements ChappalService {

	@Autowired
	private ChappalRepository repo;

	@Override
	public boolean validateAndSave(ChappalDTO dto) {
		System.out.println("Service method");
		return repo.save(dto);
	}

	@Override
	public Optional<List<ChappalDTO>> findByBrand(String brand) {
		return repo.findByBrand(brand);
	}

}
