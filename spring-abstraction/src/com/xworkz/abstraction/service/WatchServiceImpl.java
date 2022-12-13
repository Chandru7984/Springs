package com.xworkz.abstraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.WatchDTO;
import com.xworkz.abstraction.repository.WatchRepository;

@Component
public class WatchServiceImpl implements WatchService {

	@Autowired
	@Qualifier("watchRepository")
	private WatchRepository watch;
	
	@Override
	public boolean validateAndSave(WatchDTO dto) {
		System.out.println("running validate using watch");
		return watch.save(dto);
	}

}
