package com.xworkz.abstraction.achiever;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.abstraction.configuration.ATMConfiguration;
import com.xworkz.abstraction.dto.ATMDTO;
import com.xworkz.abstraction.service.ATMServiceImpl;
import com.xworkz.abstraction.service.ChairService;
import com.xworkz.abstraction.service.ChocolateService;
import com.xworkz.abstraction.service.DoorService;
import com.xworkz.abstraction.service.FloorService;
import com.xworkz.abstraction.service.FloorServiceImpl;
import com.xworkz.abstraction.service.HomeService;
import com.xworkz.abstraction.service.MobileService;
import com.xworkz.abstraction.service.PendriveService;
import com.xworkz.abstraction.service.ShopService;
import com.xworkz.abstraction.service.SwitchService;

public class ATMAchiever {

	public static void main(String[] args) {


		ApplicationContext context = new AnnotationConfigApplicationContext(ATMConfiguration.class);
		ATMServiceImpl bean = context.getBean(ATMServiceImpl.class);
		System.out.println(bean.validateAndSave(null));
		FloorServiceImpl bean2 = context.getBean(FloorServiceImpl.class);
		System.out.println(bean2.validateAndSave(null));
		ChairService bean3 = context.getBean(ChairService.class);
		System.out.println(bean3.validateAndSave(null));
		HomeService bean4 = context.getBean(HomeService.class);
		System.out.println(bean4.validateAndSave(null));
		DoorService bean5 = context.getBean(DoorService.class);
		System.out.println(bean5.validateAndSave(null));
		ShopService bean6 = context.getBean(ShopService.class);
		System.out.println(bean6.validateAndSave(null));
		PendriveService bean7 = context.getBean(PendriveService.class);
		System.out.println(bean7.validateAndSave(null));
		MobileService bean8 = context.getBean(MobileService.class);
		System.out.println(bean8.validateAndSave(null));
		SwitchService bean9 = context.getBean(SwitchService.class);
		System.out.println(bean9.validateAndSave(null));
		ChocolateService bean10 = context.getBean(ChocolateService.class);
		System.out.println(bean10.validateAndSave(null));
		
		

	}

}
