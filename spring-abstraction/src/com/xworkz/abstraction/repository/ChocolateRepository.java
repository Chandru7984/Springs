package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.dto.ChocolateDTO;

public interface ChocolateRepository {
	
	boolean save(ChocolateDTO dto);

}
