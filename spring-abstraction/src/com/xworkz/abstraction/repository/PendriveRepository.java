package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.dto.PendriveDTO;

public interface PendriveRepository {

	boolean save(PendriveDTO dto);
}
