package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.dto.DoorDTO;

public interface DoorRepository {
	
	boolean save(DoorDTO dto);
}
