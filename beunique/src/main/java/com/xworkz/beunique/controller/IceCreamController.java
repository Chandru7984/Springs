package com.xworkz.beunique.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.beunique.dto.IceCreamDTO;

@Component
@RequestMapping("/send")
public class IceCreamController {

	public IceCreamController() {
		System.out.println("create IceCreamController using default const...");
	}

	@PostMapping
	public String onSend(IceCreamDTO dto, HttpServletRequest request) {
		System.out.println("execute onSend");
		if (dto.getPrice() > 0 && dto.getQuantity() > 0) {
			request.setAttribute("message", "Ice Cream Data Saved Successfully...");
			System.out.println("Data is saved Successfully :" + dto);
			System.out.println(dto);
		} else {
			request.setAttribute("error", "Please Enter Valid Data...");
			request.setAttribute("dto", dto);
		}
		return "index.jsp";
	}

}
