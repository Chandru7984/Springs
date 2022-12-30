package com.xworkz.criminal.controller;

import java.io.File;
import java.io.IOException;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.criminal.dto.CriminalDTO;
import com.xworkz.criminal.service.CriminalService;

@Component
@RequestMapping("/crime")
public class CriminalController {

	@Autowired
	private CriminalService service;

	public CriminalController() {
		System.out.println("Create CriminalController using default const...");
	}

	@PostMapping
	public String onSend(CriminalDTO dto, Model model, @RequestParam("file") MultipartFile file) {
		System.out.println("Execute onSend");

		try {
			byte[] bytes = file.getBytes();
			String files = System.currentTimeMillis() + "" + file.getOriginalFilename();
			Path path = Paths.get("D:\\multipart_images\\" + files);
			System.out.println(path);
			Files.write(path, bytes);
			dto.setFileName(files);
			long size = file.getSize();
			dto.setFileSize(size);
			String contentType = file.getContentType();
			dto.setContentType(contentType);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean validateAndSave = service.validateAndSave(dto);
		if (validateAndSave) {
			System.out.println("Data is Valid and Saved Successfully");
			model.addAttribute("dto", dto);
			model.addAttribute("msg", "Data Saved Successfully");
			return "success";
		} else {
			System.out.println("Data is not Saved and Please enter Valid Data");
			model.addAttribute("error", "Please Enter Valid Data");
			return "index";
		}
	}

	@GetMapping
	public String onSearch(@RequestParam String name,@RequestParam String jailName, Model model) {
		System.out.println("Execute onSearch");
		Optional<List<CriminalDTO>> findByName = service.findByName(name, jailName);
//		Optional<List<CriminalDTO>> findByJailName = service.findByJailName(jailName);
		if (findByName.isPresent() && findByName.get().size() > 0) {
			List<CriminalDTO> list = findByName.get();
			System.out.println(list);
			model.addAttribute("list", list);
			model.addAttribute("message", "Search Results Found");
			return "search";
		} else {
			System.out.println("No Results Found");
			model.addAttribute("error", "No Results Found");
			return "search";
		}
	}

	@GetMapping(value = "/files/{file_name}")
	// @ResponseBody
	public void getFile(@PathVariable("file_name") String fileName, @RequestParam String contentType,
			HttpServletResponse response) throws IOException {
		System.out.println("File name is " + fileName);
		// do other stuff
		if (fileName != null && contentType != null) {
			Path path = Paths.get("D:\\multipart_images\\" + fileName);
			byte[] file = Files.readAllBytes(path);
			response.reset();
			// response.setBufferSize(DEFAULT_BUFFER_SIZE);
			response.setContentType(contentType); // or whatever file type you want to send.
			try {
				response.getOutputStream().write(file);
			} catch (IOException e) {
				// Do something
				e.printStackTrace();
			}
		}
	}

//	@GetMapping
//	public String onSearch(@RequestParam String name, String jailName, Model model) {
//		System.out.println("Execute onSearch");
//		Optional<List<CriminalDTO>> findByName = service.findByName(name);
//		Optional<List<CriminalDTO>> findByJailName = service.findByJailName(jailName);
//		if (findByName != null && findByName.get().size() > 0) {
//			List<CriminalDTO> list = findByName.get();
//			System.out.println(list);
//			model.addAttribute("message", "Search Results found");
//			model.addAttribute("list", list);
//			return "search";
//		} else if (findByJailName != null && findByJailName.get().size() > 0) {
//			List<CriminalDTO> list = findByJailName.get();
//			System.out.println(list);
//			model.addAttribute("message", "Search Results Found");
//			model.addAttribute("list", list);
//			return "search";
//		} else {
//			System.out.println("No Results Found");
//			model.addAttribute("error", "No Results Found");
//			return "search";
//		}
//	}

}
