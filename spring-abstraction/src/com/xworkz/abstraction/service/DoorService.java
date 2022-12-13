package com.xworkz.abstraction.service;

import com.xworkz.abstraction.dto.DoorDTO;

public interface DoorService {
	
	boolean validateAndSave(DoorDTO dto);

}
