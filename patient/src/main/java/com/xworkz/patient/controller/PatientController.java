package com.xworkz.patient.controller;

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

import com.xworkz.patient.dto.PatientDTO;
import com.xworkz.patient.service.PatientService;

@Component
@RequestMapping("/save")
public class PatientController {

	@Autowired
	private PatientService service;

	public PatientController() {
		System.out.println("Create PatientController using default const...");
	}

	@PostMapping
	public String onSave(PatientDTO dto, HttpServletRequest request) {
		System.out.println("Execute onSave");
		boolean findByEmail = service.findByEmail(dto.getEmail());
		boolean findByMobile = service.findByMobile(dto.getMobileNo());
		if(!findByEmail) {
			request.setAttribute("error", "Email is already Exist : "+dto.getEmail());
			return "index";
		}else if(!findByMobile){
			request.setAttribute("error", "Mobile No is already Exist : "+dto.getMobileNo());
			return "index";
		}
		else {
		boolean validateAndSave = service.validateAndSave(dto);
		if (validateAndSave) {
			request.setAttribute("message", "Patient Details Saved Successfully");
			request.setAttribute("dto", dto);
			System.out.println("Data is saved " + dto);
			return "success";
		} else {
			request.setAttribute("error", "Details is invalid");
			System.out.println("Data is not saved");
		}
		return "index";
		}
	}
	
	@GetMapping
	public String onSearch(@RequestParam String name,Model model,int age) {
		System.out.println("Execute onSearch");
		Optional<List<PatientDTO>> findByName = service.findByName(name);
		Optional<List<PatientDTO>> findAgeGreaterThan = service.findAgeGreaterThan(age);
		if(findByName.isPresent() && findByName.get().size()>0) {
			List<PatientDTO> list = findByName.get();
			System.out.println(list);
			model.addAttribute("message", "Search Results Found");
			model.addAttribute("list", list);
			return "search";
		}else if(findAgeGreaterThan.isPresent() && findAgeGreaterThan.get().size()>0) {
			List<PatientDTO> list = findAgeGreaterThan.get();
			System.out.println(list);
			model.addAttribute("list", list);
			return "search";
		}
		
		else {
			model.addAttribute("error", "No Results Found");
			return "search";
		}
		
	}
	
//	@GetMapping
//	public String onSearch(@RequestParam int age,Model model) {
//		System.out.println("Execute onSearch");
//		Optional<List<PatientDTO>> findAgeGreaterThan = service.findAgeGreaterThan(age);
//		if(findAgeGreaterThan.isPresent() && findAgeGreaterThan.get().size()>0) {
//			List<PatientDTO> list = findAgeGreaterThan.get();
//			System.out.println(list);
//			model.addAttribute("message", "Search Results Found");
//			model.addAttribute("call", list);
//			return "search";
//		}else {
//			model.addAttribute("error", "No Results Found");
//			System.out.println("No Results");
//		}
//		return "search";
//	}
	

}
