package com.xworkz.patient.dto;

import java.time.LocalDate;

import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class AbstractDTO {
	
	private String createdBy;
	private LocalDate createdDate;

}
