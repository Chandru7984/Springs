package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.dto.WatchDTO;

public interface WatchRepository {
	
	boolean save(WatchDTO dto);

}
