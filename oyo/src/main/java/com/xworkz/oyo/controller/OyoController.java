package com.xworkz.oyo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.oyo.dto.OyoDTO;
import com.xworkz.oyo.service.OyoService;

@Component
@RequestMapping("/send")
public class OyoController {

	@Autowired
	private OyoService service;

	public OyoController() {
		System.out.println("Create OyoController using default const...");
	}

	@PostMapping
	public String onSend(OyoDTO dto, HttpServletRequest request) {
		System.out.println("Execute onSend");
		boolean validateAndSave = service.validateAndSave(dto);
		if (validateAndSave) {
			request.setAttribute("message", "Oyo Data is Saved Successfully...");
			System.out.println("Data is saved successfully :" + dto);
			System.out.println(dto);
		} else {
			request.setAttribute("error", "Please enter valid Data");
			request.setAttribute("dto", dto);
		}
		return "index.jsp";
	}
}
