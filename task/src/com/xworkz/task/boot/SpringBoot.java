package com.xworkz.task.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.task.bean.Aeroplane;
import com.xworkz.task.bean.College;
import com.xworkz.task.bean.Cricket;
import com.xworkz.task.bean.Gym;
import com.xworkz.task.bean.Home;
import com.xworkz.task.bean.Institute;
import com.xworkz.task.bean.Laptop;
import com.xworkz.task.bean.Metro;
import com.xworkz.task.bean.Mobile;
import com.xworkz.task.bean.Oyo;
import com.xworkz.task.bean.Pg;
import com.xworkz.task.bean.Restaurant;
import com.xworkz.task.bean.Saloon;
import com.xworkz.task.bean.School;
import com.xworkz.task.bean.Ship;
import com.xworkz.task.bean.ShowRoom;
import com.xworkz.task.bean.SouthKitchen;
import com.xworkz.task.bean.Train;
import com.xworkz.task.bean.Tv;
import com.xworkz.task.configuration.SpringConfig;

public class SpringBoot {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println(context.getBeanDefinitionCount());
		String[] beanNames = context.getBeanDefinitionNames();
		for (String name : beanNames) {
			System.out.println(name);
		}
		
		System.out.println("========Saloon========");
		Saloon saloon = context.getBean(Saloon.class);
		System.out.println(saloon.getShopRent());
		System.out.println(saloon.getOwnerName());
		saloon.displayTvDetails();
		
		System.out.println("=========Metro=========");
		Train train = context.getBean(Train.class);
		System.out.println(train.getGovt());
		System.out.println(train.getName());
		train.getMetroDetails();
		
		System.out.println("========Home========");
		Home home = context.getBean(Home.class);
		System.out.println(home.getOwner());
		System.out.println(home.getHomeRent());
		home.detailsHomeRules();
		
		System.out.println("=========Cricket=========");
		Cricket cricket = context.getBean(Cricket.class);
		System.out.println(cricket.getTeamName());
		System.out.println(cricket.getTotalScore());
		cricket.captainDetails();
		
		System.out.println("=========SouthKitchen==========");
		SouthKitchen kitchen = context.getBean(SouthKitchen.class);
		System.out.println(kitchen.getArea());
		System.out.println(kitchen.getItems());
		kitchen.itemDetails();
		
		Institute bean1 = context.getBean(Institute.class);
		bean1.display();
		System.out.println(bean1.getInstituteName());
		System.out.println(bean1.getInstituteRating());

		Pg bean2 = context.getBean(Pg.class);
		bean2.display();
		System.out.println(bean2.getPgName());
		System.out.println(bean2.getPgRent());

		Aeroplane bean3 = context.getBean(Aeroplane.class);
		bean3.display();
		System.out.println(bean3.getCompany());
		System.out.println(bean3.getNoOfSeats());

		Ship bean4 = context.getBean(Ship.class);
		bean4.display();
		System.out.println(bean4.getCompany());
		System.out.println(bean4.getNoOfPassengers());

		ShowRoom bean5 = context.getBean(ShowRoom.class);
		bean5.display();
		System.out.println(bean5.getShowRoomName());
		System.out.println(bean5.getShowRoomRating());

		Mobile bean6 = context.getBean(Mobile.class);
		bean6.display();
		System.out.println(bean6.getMobileBrand());
		System.out.println(bean6.getMobilePrice());

		Laptop bean7 = context.getBean(Laptop.class);
		bean7.display();
		System.out.println(bean7.getLaptopBrand());
		System.out.println(bean7.getLaptopPrice());

		Oyo bean8 = context.getBean(Oyo.class);
		bean8.display();
		System.out.println(bean8.getOyoName());
		System.out.println(bean8.getOyoPrice());

		Gym bean9 = context.getBean(Gym.class);
		bean9.display();
		System.out.println(bean9.getGymName());
		System.out.println(bean9.getGymFees());

		Restaurant bean10 = context.getBean(Restaurant.class);
		bean10.display();
		System.out.println(bean10.getRestaurentName());
		System.out.println(bean10.getRestaurentRating());
		
		School bean11 = context.getBean(School.class);
		bean11.display();
		System.out.println(bean11.getSchoolName());
		System.out.println(bean11.getSince());
		
		College bean12 = context.getBean(College.class);
		bean12.display();
		System.out.println(bean12.getCollegeName());
		System.out.println(bean12.getCollegeRating());
	}

}
