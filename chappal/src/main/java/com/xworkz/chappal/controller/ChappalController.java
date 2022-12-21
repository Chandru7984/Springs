package com.xworkz.chappal.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.chappal.dto.ChappalDTO;
import com.xworkz.chappal.service.ChappalService;

@Component
@RequestMapping("/send")
public class ChappalController {
	
	@Autowired
	private ChappalService service;
	
	public ChappalController() {
		System.out.println("Create ChappalController using default const...");
	}

	@PostMapping
	public String onSend(ChappalDTO dto,HttpServletRequest request) {
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
		return "index";
	}
	
	@GetMapping
	public String searchByBrand(@RequestParam String brand,Model model) {
		System.out.println("Search by Brand method is Executed...");
		Optional<List<ChappalDTO>> findByBrand = service.findByBrand(brand);
		if(findByBrand.isPresent() && findByBrand.get().size()>0) {
			List<ChappalDTO> list = findByBrand.get();
			System.out.println(list);
			model.addAttribute("message", "Results Found");
			model.addAttribute("dto", list);
			return "searchBrand";
		}else {
			System.out.println("No Results Found");
			model.addAttribute("error", "Results not Found");
			return "search";
		}
	}
}
