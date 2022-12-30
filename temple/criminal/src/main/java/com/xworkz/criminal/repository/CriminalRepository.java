package com.xworkz.criminal.repository;

import java.util.List;
import java.util.Optional;

import com.xworkz.criminal.dto.CriminalDTO;

public interface CriminalRepository {

	boolean save(CriminalDTO dto);
	
	Optional<List<CriminalDTO>> findByName(String name,String jailName);
	
//	Optional<List<CriminalDTO>> findByJailName(String jailName);

}
