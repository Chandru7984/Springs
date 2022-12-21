package com.xworkz.patient.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patient")
public class PatientDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private int age;
	private long mobileNo;
	private String gender;
	private String idProof;
	private String idValue;

	public PatientDTO(String name, String email, int age, long mobileNo, String gender, String idProof,
			String idValue) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.idProof = idProof;
		this.idValue = idValue;
	}

}
