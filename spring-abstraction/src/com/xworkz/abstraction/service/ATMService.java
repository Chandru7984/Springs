package com.xworkz.abstraction.service;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.ATMDTO;

@Component
public interface ATMService {
	
	public boolean validateAndSave(ATMDTO dto);

}
