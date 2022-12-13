package com.xworkz.abstraction.service;

import com.xworkz.abstraction.dto.PendriveDTO;

public interface PendriveService {
	
	boolean validateAndSave(PendriveDTO dto);

}
