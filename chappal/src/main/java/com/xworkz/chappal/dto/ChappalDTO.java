package com.xworkz.chappal.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "chappal3")
@NamedQuery(name = "findByBrand",query = "select ninu from ChappalDTO ninu where ninu.brand=:cp")
public class ChappalDTO implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String brand;
	private double price;
	private String color;
	private double size;
	private String gender;

	public ChappalDTO(String brand, double price, String color, double size, String gender) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.size = size;
		this.gender = gender;
	}

}
