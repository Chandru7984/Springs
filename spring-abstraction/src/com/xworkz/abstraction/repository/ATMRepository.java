package com.xworkz.abstraction.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction.dto.ATMDTO;

@Component
public interface ATMRepository {
	
	public boolean save(ATMDTO dto);

}
