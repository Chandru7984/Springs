package com.xworkz.patient.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.patient.dto.PatientDTO;
import com.xworkz.patient.service.PatientService;

@ComponentScan
@RequestMapping("/save")
public class PatientController {
	
	@Autowired
	private PatientService service;
	
	public PatientController() {
		System.out.println("Create PatientController using default const...");
	}

	@PostMapping
	public String onSave(PatientDTO dto,HttpServletRequest request) {
		System.out.println("Execute onSave");
		boolean validateAndSave = service.validateAndSave(dto);
		if(validateAndSave) {
			request.setAttribute("message", "Details Saved Successfully");
			System.out.println("Data Saved Successfully "+dto);
			System.out.println(dto);
		}else {
			request.setAttribute("error", "Details is not Saved");
			System.out.println("Data is not Saved");
		}
		return "index";
	}
}
