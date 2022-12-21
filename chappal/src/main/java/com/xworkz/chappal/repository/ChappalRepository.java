package com.xworkz.chappal.repository;

import java.util.List;
import java.util.Optional;

import com.xworkz.chappal.dto.ChappalDTO;

public interface ChappalRepository {
	
	boolean save(ChappalDTO dto);
	
	Optional<List<ChappalDTO>> findByBrand(String brand);

}
