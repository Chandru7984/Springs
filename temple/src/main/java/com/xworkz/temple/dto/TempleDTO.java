package com.xworkz.temple.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "temple3")
@NamedQuery(name = "findByGod",query = "select ninu from TempleDTO ninu where ninu.mainGod=:cs")

public class TempleDTO implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull
	@NotBlank
	@Length(min = 3, max = 50)
	private String name;
	@NotNull
	@NotBlank
	@Length(min = 3, max = 50)
	private String location;
	@NotNull
	@NotBlank
	@Length(min = 3, max = 50)
	private String mainGod;
	private int pincode;
	private int fees;
	private double openTime;
	private double closeTime;
	
	public TempleDTO(String name, String location, String mainGod, int pincode, int fees, double openTime,
			double closeTime) {
		super();
		this.name = name;
		this.location = location;
		this.mainGod = mainGod;
		this.pincode = pincode;
		this.fees = fees;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}
	

}
