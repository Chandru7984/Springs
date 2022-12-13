package com.xworkz.temple.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.temple.dto.TempleDTO;
import com.xworkz.temple.service.TempleService;

@Component
@RequestMapping("/save")
public class TempleController {
	
	@Autowired
	private TempleService service;
	
	public TempleController() {
		System.out.println("Create TempleController using default const...");
	}
	
	@PostMapping
	public String keep(TempleDTO dto,HttpServletRequest request) {
		System.out.println("Execute keep");
		boolean validateAndSave = service.validateAndSave(dto);
		if(validateAndSave) {
			request.setAttribute("message", "Temple Data is saved Successfully...");
			System.out.println("Data is saved Successfully " +dto);
			System.out.println(dto);
		}else {
			request.setAttribute("error", "Please Enter Valid Data...");
			request.setAttribute("dto", dto);
		}
		return "index.jsp";
	}

}
