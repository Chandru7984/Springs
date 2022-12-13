package com.xworkz.abstraction.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.abstraction.repository.ATMRepository;
import com.xworkz.abstraction.repository.ATMRepositoryImpl;
import com.xworkz.abstraction.repository.ChairRepository;
import com.xworkz.abstraction.repository.ChairRepositoryImpl;
import com.xworkz.abstraction.repository.ChocolateRepository;
import com.xworkz.abstraction.repository.ChocolateRepositoryImpl;
import com.xworkz.abstraction.repository.DoorRepository;
import com.xworkz.abstraction.repository.DoorRepositoryImpl;
import com.xworkz.abstraction.repository.FloorRepository;
import com.xworkz.abstraction.repository.FloorRepositoryImpl;
import com.xworkz.abstraction.repository.HomeRepository;
import com.xworkz.abstraction.repository.HomeRepositoryImpl;
import com.xworkz.abstraction.repository.MobileRepository;
import com.xworkz.abstraction.repository.MobileRepositoryImpl;
import com.xworkz.abstraction.repository.PendriveRepository;
import com.xworkz.abstraction.repository.PendriveRepositoryImpl;
import com.xworkz.abstraction.repository.ShopRepository;
import com.xworkz.abstraction.repository.ShopRepositoryImpl;
import com.xworkz.abstraction.repository.SwitchRepository;
import com.xworkz.abstraction.repository.SwitchRepositoryImpl;
import com.xworkz.abstraction.repository.WatchRepository;
import com.xworkz.abstraction.repository.WatchRepositoryImpl;

@Configuration
@ComponentScan("com.xworkz")
public class ATMConfiguration {
	
	 public ATMConfiguration() {
		System.out.println("Running Configuration");
	}
	 
	 @Bean
	 public ATMRepository atmRepository() {
		ATMRepository atmRepository = new ATMRepositoryImpl();
		return atmRepository;
	 }
	 
	 @Bean
	 public ATMRepository atmRepository1() {
		ATMRepository atmRepository = new ATMRepositoryImpl();
		return atmRepository;
	 }
	 
	 @Bean
	 public FloorRepository floorRepository() {
		 FloorRepository floorRepository = new FloorRepositoryImpl();
		 return floorRepository;
	 }
	 
	 @Bean
	 public FloorRepository floorRepository1() {
		 return new FloorRepositoryImpl();
	 }
	 
	 @Bean
	 public ChairRepository chairRepository() {
		 return new ChairRepositoryImpl();
	 }
	 
	 @Bean
	 public HomeRepository homeRepository() {
		 return new HomeRepositoryImpl();
	 }
	 
	 @Bean
	 public WatchRepository watchRepository() {
		 return new WatchRepositoryImpl();
	 }
	 
	 @Bean
	 public DoorRepository doorRepository() {
		 return new DoorRepositoryImpl();
	 }
	 
	 @Bean
	 public ShopRepository shopRepository() {
		 return new ShopRepositoryImpl();
	 }
	 
	 @Bean
	 public PendriveRepository pendriveRepository() {
		 return new PendriveRepositoryImpl();
	 }
	 
	 @Bean
	 public MobileRepository mobileRepository() {
		 return new MobileRepositoryImpl();
	 }
	 
	 @Bean
	 public SwitchRepository switchRepository() {
		 return new SwitchRepositoryImpl();
	 }
	 
	 @Bean
	 public ChocolateRepository chocoRepository() {
		 return new ChocolateRepositoryImpl();
	 }

}
