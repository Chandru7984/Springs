package com.xworkz.abstraction.service;

import com.xworkz.abstraction.dto.WatchDTO;

public interface WatchService {
	
	boolean validateAndSave(WatchDTO dto);

}
