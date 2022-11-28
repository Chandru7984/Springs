package com.xworkz.task.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfig {
	
	@Bean
	public double shopRent() {
		return 10000.0;
	}
	
	@Bean
	public String ownerName() {
		System.out.println("Register ownerName");
		return "Raju";
	}
	
	@Bean
	public String brand() {
		return "Sony";
	}
	
	@Bean
	public String govt() {
		System.out.println("Register Train");
		return "Central";
	}
	
	@Bean
	public String name() {
		return "Indian Railways";
	}
	
	@Bean
	public String corporation() {
		return "BMRCL";
	}
	
	@Bean
	public double noOfRoutes() {
		return 4.0;
	}
	
	@Bean
	public String owner() {
		System.out.println("Register Home");
		return "Suresh";
	}
	
	@Bean
	public double homeRent() {
		return 7775;
	}
	
	@Bean
	public String tenent() {
		return "Prajwal";
	}
	
	@Bean
	public double waterBill() {
		return 220.0;
	}
	
	@Bean
	public String teamName() {
		System.out.println("Register Cricket");
		return "INDIA";
	}
	
	@Bean
	public int totalScore() {
		return 220;
	}
	
	@Bean
	public String captainName() {
		return "Rohit Sharma";
	}
	
	@Bean
	public int captainCenturies() {
		return 42;
	}
	
	@Bean
	public String area() {
		System.out.println("Register SouthKitchen");
		return "Basavanagudi";
	}
	
	@Bean
	public int items() {
		return 8;
	}
	
	@Bean
	public String item() {
		return "Vada";
	}
	
	@Bean
	public double price() {
		return 20.0;
	}
	
	@Bean
	String instituteName() {
		return "xyz";
	}

	@Bean
	public double instituteRating() {
		return 4.9;
	}

	@Bean
	public String trainerName() {
		return "suhas";
	}

	@Bean
	public int trainerAge() {
		return 27;
	}

	@Bean
	public String pgName() {
		return "Krishna";
	}

	@Bean
	public double pgRent() {
		return 5000.00;
	}

	@Bean
	public String pgOwnerName() {
		return "bala";
	}

	@Bean
	public int pgOwnerAge() {
		return 38;
	}

	@Bean
	public int noOfSeats() {
		return 50;
	}

	@Bean
	public String pilotName() {
		return "manoj";
	}

	@Bean
	public int pilotAge() {
		return 35;
	}

	@Bean
	public int noOfPassengers() {
		return 65;
	}

	@Bean
	public int captainAge() {
		return 40;
	}

	@Bean
	public String color() {
		return "grey";
	}

	@Bean
	public int noOfPlayers() {
		return 11;
	}

	@Bean
	public String teamCaptainName() {
		return "Rohit Sharma";
	}

	@Bean
	public int teamCaptainAge() {
		return 35;
	}

	@Bean
	public String showRoomName() {
		return "Bajaj";
	}

	@Bean
	public double showRoomRating() {
		return 4.8;
	}

	@Bean
	public String showRoomOwnerName() {
		return "raghu";
	}

	@Bean
	public int showRoomOwnerAge() {
		return 42;
	}

	@Bean
	public String mobileBrand() {
		return "vivo";
	}

	@Bean
	public double mobilePrice() {
		return 18500;
	}

	@Bean
	public String simCompany() {
		return "Airtel";
	}

	@Bean
	public String network() {
		return "4G";
	}

	@Bean
	public String laptopBrand() {
		return "Dell";
	}

	@Bean
	public double laptopPrice() {
		return 35000.00;
	}

	@Bean
	public String graphicCardBrand() {
		return "Nvdia";
	}

	@Bean
	public double graphicCardPrice() {
		return 4000.00;
	}

	@Bean
	public String oyoName() {
		return "honey";
	}

	@Bean
	public double oyoPrice() {
		return 1500.00;
	}

	@Bean
	public String customerName() {
		return "suhas";
	}

	@Bean
	public int noOfCustomer() {
		return 10;
	}

	@Bean
	public String gymName() {
		return "Sparten";
	}

	@Bean
	public double gymFees() {
		return 500.00;
	}

	@Bean
	public String gymTrainerName() {
		return "Anil pujari";
	}

	@Bean
	public int gymTrainerAge() {
		return 33;
	}

	@Bean
	public String restaurentName() {
		return "rejintal";
	}

	@Bean
	public double restaurentRating() {
		return 4.95;
	}

	@Bean
	public String schoolName() {
		return "BMEMS";
	}

	@Bean
	public int since() {
		return 1952;
	}

	@Bean
	public String studentName() {
		return "Hanamant";
	}

	@Bean
	public int studentAge() {
		return 15;
	}
	
	@Bean
	public String collegeName() {
		return "PC Jabin";
	}
	
	@Bean
	public double collegeRating() {
		return 4.9;
	}
	
}
