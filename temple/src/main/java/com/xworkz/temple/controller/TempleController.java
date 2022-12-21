package com.xworkz.temple.controller;

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
	public String keep(TempleDTO dto, HttpServletRequest request) {
		System.out.println("Execute keep");
		boolean validateAndSave = service.validateAndSave(dto);
		if (validateAndSave) {
			request.setAttribute("message", "Temple Data is saved Successfully...");
			System.out.println("Data is saved Successfully " + dto);
			System.out.println(dto);
		} else {
			request.setAttribute("error", "Please Enter Valid Data...");
			request.setAttribute("dto", dto);
		}
		return "index";
	}

	@GetMapping
	public String searchByGod(@RequestParam String mainGod, Model model) {
		Optional<List<TempleDTO>> findByGod = service.findByGod(mainGod);
		if (findByGod.isPresent() && findByGod.get().size() > 0) {
			List<TempleDTO> list = findByGod.get();
			System.out.println(list);
			model.addAttribute("message", "Results found");
			model.addAttribute("dto", list);
			return "searchGod";
		} else {
			System.out.println("No results found");
			model.addAttribute("error", "No Results found");
			return "search";
		}
		
	}

}
