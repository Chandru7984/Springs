package com.xworkz.showroom.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.showroom.dto.ShowroomDTO;
import com.xworkz.showroom.service.ShowroomService;

@Component
@RequestMapping("/send")
public class ShowroomController {
	
	@Autowired
	private ShowroomService service;
	
	public ShowroomController() {
		System.out.println("Create ShowroomController using default const...");
	}
	
	@PostMapping
	public String onSend(ShowroomDTO dto,HttpServletRequest request) {
		System.out.println("Execute onSend");
		boolean validateAndSave = service.validateAndSave(dto);
		if(validateAndSave) {
			request.setAttribute("message", "Chappal Data is saved Successfully...");
			System.out.println("Data is saved successfully :" +dto);
			System.out.println(dto);
		}else {
			request.setAttribute("error", "Please enter valid Data...");
			request.setAttribute("dto", dto);
		}
		return "index.jsp";
		}
}
