package com.xworkz.country.beans;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Country {

	@Value("INDIA")
	private String name;
	@Autowired
	private President president;
	@Autowired
	private VicePresident vicePresident;
	@Autowired
	private PrimeMinister primeMinister;
	@Value("1237117")
	private int armySize;
	@Value("Republic")
	private String type;
	@Value("29")
	private int states;
	@Autowired
	@Qualifier("unionTerritoryNames")
	private UnionTerriotories [] unionTerritories;
	@Autowired
	private CapitalCity capitalCity;
	
	@Override
	public String toString() {
		return "Country [name=" + name + ", president=" + president + ", vicePresident=" + vicePresident
				+ ", primeMinister=" + primeMinister + ", armySize=" + armySize + ", type=" + type + ", states="
				+ states + ", unionTerritories=" + Arrays.toString(unionTerritories) + ", capitalCity=" + capitalCity
				+ "]";
	}
	
	

}
