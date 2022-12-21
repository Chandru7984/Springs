package com.xworkz.temple.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.temple.dto.TempleDTO;
import com.xworkz.temple.repository.TempleRepository;

@Component
public class TempleServiceImpl implements TempleService {
	
	@Autowired
	private TempleRepository repo;

	@Override
	public boolean validateAndSave(TempleDTO dto) {
		System.out.println("Calling Service method");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<TempleDTO>> validate = validator.validate(dto);
		if(validate.size()>0) {
			System.out.println("Please fix the Bugs");
		}else {
			System.out.println("Data is valid");
			repo.save(dto);
		}
		return true;
	}

	@Override
	public Optional<List<TempleDTO>> findByGod(String god) {
		return repo.findByGod(god);
	}
	
	

}
