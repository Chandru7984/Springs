package com.xworkz.abstraction.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class ATMDTO {

	@Autowired
	@Qualifier("atmId")
	private int id;
	@Autowired
	@Qualifier("atmRepository")
	private String bankName;
	@Autowired
	@Qualifier("atmRepository1")
	private String cardType;

	public ATMDTO() {
		System.out.println("default");
	}
}
