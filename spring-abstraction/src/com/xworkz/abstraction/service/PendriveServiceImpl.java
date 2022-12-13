package com.xworkz.abstraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.PendriveDTO;
import com.xworkz.abstraction.repository.PendriveRepository;

@Component
public class PendriveServiceImpl implements PendriveService {

	@Autowired
	@Qualifier("pendriveRepository")
	private PendriveRepository pendrive;
	
	@Override
	public boolean validateAndSave(PendriveDTO dto) {
		System.out.println("running validate using pendrive");
		return pendrive.save(dto);
	}

}
