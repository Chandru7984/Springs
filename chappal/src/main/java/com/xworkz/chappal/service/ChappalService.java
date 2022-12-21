package com.xworkz.chappal.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.chappal.dto.ChappalDTO;

public interface ChappalService {
	
	boolean validateAndSave(ChappalDTO dto);
	
	Optional<List<ChappalDTO>> findByBrand(String brand);

}
