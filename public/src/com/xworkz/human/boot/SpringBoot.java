package com.xworkz.human.boot;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.xworkz.human.bean.Human;
import com.xworkz.human.config.SpringConfiguration;

@ComponentScan("com.xworkz")
public class SpringBoot {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

//		Human bean = context.getBean(Human.class);
//		bean.live();
		System.out.println(context.getBean("name", String.class).hashCode());

		System.out.println(context.getBean("name1", String.class).hashCode());
		
		System.out.println(context.getBean("name2", String.class).hashCode());
		
		System.out.println(context.getBean("name3", String.class).hashCode());
		
		System.out.println(context.getBean("car",String.class).hashCode());
		
		System.out.println(context.getBean("train", String.class).hashCode());
		
		System.out.println(context.getBean("bike", String.class).hashCode());
		
		System.out.println(context.getBean("cycle", String.class).hashCode());
		
		System.out.println(context.getBean("truck",String.class).hashCode());
		
		System.out.println(context.getBean("name5", String.class).hashCode());

		System.out.println(context.getBean("name6", String.class).hashCode());
		
		System.out.println(context.getBean("name7", String.class).hashCode());
		
		System.out.println(context.getBean("name8", String.class).hashCode());
		
		System.out.println(context.getBean("car1",String.class).hashCode());
		
		System.out.println(context.getBean("train1", String.class).hashCode());
		
		System.out.println(context.getBean("bike1", String.class).hashCode());
		
		System.out.println(context.getBean("cycle1", String.class).hashCode());
		
		System.out.println(context.getBean("truck1",String.class).hashCode());
		
		System.out.println(context.getBean("name9", String.class).hashCode());

		System.out.println(context.getBean("name10", String.class).hashCode());
		
		System.out.println(context.getBean("name11", String.class).hashCode());
		
		System.out.println(context.getBean("name12", String.class).hashCode());
		
		System.out.println(context.getBean("car2",String.class).hashCode());
		
		System.out.println(context.getBean("train2", String.class).hashCode());
		
		System.out.println(context.getBean("bike2", String.class).hashCode());
		
		
		System.out.println(context.getBean("cycle2", String.class).hashCode());
		
		System.out.println(context.getBean("truck2",String.class).hashCode());
		
		System.out.println(context.getBean("car4", String.class).hashCode());
		System.out.println(context.getBean("car5", String.class).hashCode());
		System.out.println(context.getBean("car6", String.class).hashCode());
		System.out.println(context.getBean("car7", String.class).hashCode());
		System.out.println(context.getBean("car8", String.class).hashCode());
		System.out.println(context.getBean("car9", String.class).hashCode());
		System.out.println(context.getBean("car10", String.class).hashCode());
		System.out.println(context.getBean("car11", String.class).hashCode());
		System.out.println(context.getBean("car12", String.class).hashCode());
		System.out.println(context.getBean("car13", String.class).hashCode());
		System.out.println(context.getBean("car14", String.class).hashCode());
		System.out.println(context.getBean("car15", String.class).hashCode());
		System.out.println(context.getBean("car16", String.class).hashCode());
		System.out.println(context.getBean("car17", String.class).hashCode());
		System.out.println(context.getBean("car18", String.class).hashCode());
		System.out.println(context.getBean("car19", String.class).hashCode());
		System.out.println(context.getBean("car20", String.class).hashCode());
		System.out.println(context.getBean("car21", String.class).hashCode());
		System.out.println(context.getBean("car22", String.class).hashCode());
		System.out.println(context.getBean("car23", String.class).hashCode());
		System.out.println(context.getBean("car24", String.class).hashCode());
		System.out.println(context.getBean("car25", String.class).hashCode());
		System.out.println(context.getBean("car26", String.class).hashCode());
		System.out.println(context.getBean("car27", String.class).hashCode());
		System.out.println(context.getBean("car28", String.class).hashCode());
		System.out.println(context.getBean("car29", String.class).hashCode());
		System.out.println(context.getBean("car30", String.class).hashCode());
		System.out.println(context.getBean("car31", String.class).hashCode());
		System.out.println(context.getBean("car32", String.class).hashCode());
		System.out.println(context.getBean("car33", String.class).hashCode());
		System.out.println(context.getBean("car34", String.class).hashCode());
		System.out.println(context.getBean("car35", String.class).hashCode());
		System.out.println(context.getBean("car36", String.class).hashCode());
		System.out.println(context.getBean("car37", String.class).hashCode());
		System.out.println(context.getBean("car38", String.class).hashCode());
		System.out.println(context.getBean("car39", String.class).hashCode());
		System.out.println(context.getBean("car40", String.class).hashCode());
		System.out.println(context.getBean("car41", String.class).hashCode());
		System.out.println(context.getBean("car42", String.class).hashCode());
		System.out.println(context.getBean("car43", String.class).hashCode());
		System.out.println(context.getBean("car44", String.class).hashCode());
		System.out.println(context.getBean("car45", String.class).hashCode());
		System.out.println(context.getBean("car46", String.class).hashCode());
		System.out.println(context.getBean("car47", String.class).hashCode());
		System.out.println(context.getBean("car48", String.class).hashCode());
		System.out.println(context.getBean("car49", String.class).hashCode());
		System.out.println(context.getBean("car50", String.class).hashCode());
		System.out.println(context.getBean("car51", String.class).hashCode());
		System.out.println(context.getBean("car52", String.class).hashCode());
		System.out.println(context.getBean("car53", String.class).hashCode());
		System.out.println(context.getBean("car54", String.class).hashCode());
		System.out.println(context.getBean("car55", String.class).hashCode());
		System.out.println(context.getBean("car56", String.class).hashCode());
		System.out.println(context.getBean("car57", String.class).hashCode());
		System.out.println(context.getBean("car58", String.class).hashCode());
		System.out.println(context.getBean("car59", String.class).hashCode());
		System.out.println(context.getBean("car60", String.class).hashCode());
		System.out.println(context.getBean("car61", String.class).hashCode());
		System.out.println(context.getBean("car62", String.class).hashCode());
		System.out.println(context.getBean("car63", String.class).hashCode());
		System.out.println(context.getBean("car64", String.class).hashCode());
		System.out.println(context.getBean("car65", String.class).hashCode());
		System.out.println(context.getBean("car66", String.class).hashCode());
		System.out.println(context.getBean("car67", String.class).hashCode());
		System.out.println(context.getBean("car68", String.class).hashCode());
		System.out.println(context.getBean("car69", String.class).hashCode());
		System.out.println(context.getBean("car70", String.class).hashCode());
		System.out.println(context.getBean("car71", String.class).hashCode());
		System.out.println(context.getBean("car72", String.class).hashCode());
		System.out.println(context.getBean("car73", String.class).hashCode());
		System.out.println(context.getBean("car74", String.class).hashCode());
		System.out.println(context.getBean("car75", String.class).hashCode());
		System.out.println(context.getBean("car76", String.class).hashCode());
		System.out.println(context.getBean("car77", String.class).hashCode());
		System.out.println(context.getBean("car78", String.class).hashCode());
		System.out.println(context.getBean("car79", String.class).hashCode());
		System.out.println(context.getBean("car80", String.class).hashCode());
		System.out.println(context.getBean("car81", String.class).hashCode());
		System.out.println(context.getBean("car82", String.class).hashCode());
		System.out.println(context.getBean("car83", String.class).hashCode());
		System.out.println(context.getBean("car84", String.class).hashCode());
		System.out.println(context.getBean("car85", String.class).hashCode());
		System.out.println(context.getBean("car86", String.class).hashCode());
		System.out.println(context.getBean("car87", String.class).hashCode());
		System.out.println(context.getBean("car88", String.class).hashCode());
		System.out.println(context.getBean("car89", String.class).hashCode());
		System.out.println(context.getBean("car90", String.class).hashCode());
		System.out.println(context.getBean("car91", String.class).hashCode());
		System.out.println(context.getBean("car92", String.class).hashCode());
		System.out.println(context.getBean("car93", String.class).hashCode());
		System.out.println(context.getBean("car94", String.class).hashCode());
		System.out.println(context.getBean("car95", String.class).hashCode());
		System.out.println(context.getBean("car96", String.class).hashCode());
		System.out.println(context.getBean("car97", String.class).hashCode());
		System.out.println(context.getBean("car98", String.class).hashCode());
		System.out.println(context.getBean("car99", String.class).hashCode());
		System.out.println(context.getBean("car100", String.class).hashCode());
		System.out.println(context.getBean("car101", String.class).hashCode());
		System.out.println(context.getBean("car102", String.class).hashCode());
		System.out.println(context.getBean("car103", String.class).hashCode());
		System.out.println(context.getBean("car104", String.class).hashCode());
		System.out.println(context.getBean("car105", String.class).hashCode());
		System.out.println(context.getBean("car106", String.class).hashCode());
		System.out.println(context.getBean("car107", String.class).hashCode());
		System.out.println(context.getBean("car108", String.class).hashCode());
		System.out.println(context.getBean("car109", String.class).hashCode());
		System.out.println(context.getBean("car110", String.class).hashCode());
		System.out.println(context.getBean("car111", String.class).hashCode());
		System.out.println(context.getBean("car112", String.class).hashCode());
		System.out.println(context.getBean("car113", String.class).hashCode());
		System.out.println(context.getBean("car114", String.class).hashCode());
		System.out.println(context.getBean("car115", String.class).hashCode());
		System.out.println(context.getBean("car116", String.class).hashCode());
		System.out.println(context.getBean("car117", String.class).hashCode());
		System.out.println(context.getBean("car118", String.class).hashCode());
		System.out.println(context.getBean("car119", String.class).hashCode());
		System.out.println(context.getBean("car120", String.class).hashCode());
		System.out.println(context.getBean("car121", String.class).hashCode());
		System.out.println(context.getBean("car122", String.class).hashCode());
		System.out.println(context.getBean("car123", String.class).hashCode());
		System.out.println(context.getBean("car124", String.class).hashCode());
		System.out.println(context.getBean("car125", String.class).hashCode());
		System.out.println(context.getBean("car126", String.class).hashCode());
		System.out.println(context.getBean("car127", String.class).hashCode());
		System.out.println(context.getBean("car128", String.class).hashCode());
		System.out.println(context.getBean("car129", String.class).hashCode());
		System.out.println(context.getBean("car130", String.class).hashCode());
		System.out.println(context.getBean("car131", String.class).hashCode());
		System.out.println(context.getBean("car132", String.class).hashCode());
		System.out.println(context.getBean("car133", String.class).hashCode());
		System.out.println(context.getBean("car134", String.class).hashCode());
		System.out.println(context.getBean("car135", String.class).hashCode());
		System.out.println(context.getBean("car136", String.class).hashCode());
		System.out.println(context.getBean("car137", String.class).hashCode());
		System.out.println(context.getBean("car138", String.class).hashCode());
		System.out.println(context.getBean("car139", String.class).hashCode());
		System.out.println(context.getBean("car140", String.class).hashCode());
		System.out.println(context.getBean("car141", String.class).hashCode());
		System.out.println(context.getBean("car142", String.class).hashCode());
		System.out.println(context.getBean("car143", String.class).hashCode());
		System.out.println(context.getBean("car144", String.class).hashCode());
		System.out.println(context.getBean("car145", String.class).hashCode());
		System.out.println(context.getBean("car146", String.class).hashCode());
		System.out.println(context.getBean("car147", String.class).hashCode());
		System.out.println(context.getBean("car148", String.class).hashCode());
		System.out.println(context.getBean("car149", String.class).hashCode());
		System.out.println(context.getBean("car150", String.class).hashCode());
		System.out.println(context.getBean("car151", String.class).hashCode());
		System.out.println(context.getBean("car152", String.class).hashCode());
		System.out.println(context.getBean("car153", String.class).hashCode());
		System.out.println(context.getBean("car154", String.class).hashCode());
		System.out.println(context.getBean("car155", String.class).hashCode());
		System.out.println(context.getBean("car156", String.class).hashCode());
		System.out.println(context.getBean("car157", String.class).hashCode());
		System.out.println(context.getBean("car158", String.class).hashCode());
		System.out.println(context.getBean("car159", String.class).hashCode());
		System.out.println(context.getBean("car160", String.class).hashCode());
		System.out.println(context.getBean("car171", String.class).hashCode());
		System.out.println(context.getBean("car172", String.class).hashCode());
		System.out.println(context.getBean("car173", String.class).hashCode());
		System.out.println(context.getBean("car174", String.class).hashCode());
		System.out.println(context.getBean("car175", String.class).hashCode());
		System.out.println(context.getBean("car176", String.class).hashCode());
		System.out.println(context.getBean("car177", String.class).hashCode());
		System.out.println(context.getBean("car178", String.class).hashCode());
		System.out.println(context.getBean("car179", String.class).hashCode());
		System.out.println(context.getBean("car180", String.class).hashCode());
		System.out.println(context.getBean("car181", String.class).hashCode());
		System.out.println(context.getBean("car182", String.class).hashCode());
		System.out.println(context.getBean("car183", String.class).hashCode());
		System.out.println(context.getBean("car184", String.class).hashCode());
		System.out.println(context.getBean("car185", String.class).hashCode());
		System.out.println(context.getBean("car186", String.class).hashCode());
		System.out.println(context.getBean("car187", String.class).hashCode());
		System.out.println(context.getBean("car188", String.class).hashCode());
		System.out.println(context.getBean("car189", String.class).hashCode());
		System.out.println(context.getBean("car190", String.class).hashCode());
		System.out.println(context.getBean("car191", String.class).hashCode());
		System.out.println(context.getBean("car192", String.class).hashCode());
		System.out.println(context.getBean("car193", String.class).hashCode());
		System.out.println(context.getBean("car194", String.class).hashCode());
		System.out.println(context.getBean("car195", String.class).hashCode());
		System.out.println(context.getBean("car196", String.class).hashCode());
		System.out.println(context.getBean("car197", String.class).hashCode());
		System.out.println(context.getBean("car198", String.class).hashCode());
		System.out.println(context.getBean("car199", String.class).hashCode());
		System.out.println(context.getBean("car200", String.class).hashCode());
		System.out.println(context.getBean("car201", String.class).hashCode());
		System.out.println(context.getBean("car202", String.class).hashCode());
		System.out.println(context.getBean("car203", String.class).hashCode());
		System.out.println(context.getBean("car204", String.class).hashCode());
		System.out.println(context.getBean("car205", String.class).hashCode());
		System.out.println(context.getBean("car206", String.class).hashCode());
		System.out.println(context.getBean("car207", String.class).hashCode());
		System.out.println(context.getBean("car208", String.class).hashCode());
		System.out.println(context.getBean("car209", String.class).hashCode());
		System.out.println(context.getBean("car210", String.class).hashCode());
		System.out.println(context.getBean("car211", String.class).hashCode());
		System.out.println(context.getBean("car212", String.class).hashCode());
		System.out.println(context.getBean("car213", String.class).hashCode());
		System.out.println(context.getBean("car214", String.class).hashCode());
		System.out.println(context.getBean("car215", String.class).hashCode());
		System.out.println(context.getBean("car216", String.class).hashCode());
		System.out.println(context.getBean("car217", String.class).hashCode());
		System.out.println(context.getBean("car218", String.class).hashCode());
		System.out.println(context.getBean("car219", String.class).hashCode());
		System.out.println(context.getBean("car220", String.class).hashCode());
		System.out.println(context.getBean("car221", String.class).hashCode());
		System.out.println(context.getBean("car222", String.class).hashCode());
		System.out.println(context.getBean("car223", String.class).hashCode());
		System.out.println(context.getBean("car224", String.class).hashCode());
		System.out.println(context.getBean("car225", String.class).hashCode());
		System.out.println(context.getBean("car226", String.class).hashCode());
		System.out.println(context.getBean("car227", String.class).hashCode());
		System.out.println(context.getBean("car228", String.class).hashCode());
		System.out.println(context.getBean("car229", String.class).hashCode());
		System.out.println(context.getBean("car230", String.class).hashCode());
		System.out.println(context.getBean("car231", String.class).hashCode());
		System.out.println(context.getBean("car232", String.class).hashCode());
		System.out.println(context.getBean("car233", String.class).hashCode());
		System.out.println(context.getBean("car234", String.class).hashCode());
		System.out.println(context.getBean("car235", String.class).hashCode());
		System.out.println(context.getBean("car236", String.class).hashCode());
		System.out.println(context.getBean("car237", String.class).hashCode());
		System.out.println(context.getBean("car238", String.class).hashCode());
		System.out.println(context.getBean("car239", String.class).hashCode());
		System.out.println(context.getBean("car240", String.class).hashCode());
		System.out.println(context.getBean("car241", String.class).hashCode());
		System.out.println(context.getBean("car242", String.class).hashCode());
		System.out.println(context.getBean("car243", String.class).hashCode());
		System.out.println(context.getBean("car244", String.class).hashCode());
		System.out.println(context.getBean("car245", String.class).hashCode());
		System.out.println(context.getBean("car246", String.class).hashCode());
		System.out.println(context.getBean("car247", String.class).hashCode());
		System.out.println(context.getBean("car248", String.class).hashCode());
		System.out.println(context.getBean("car249", String.class).hashCode());
		System.out.println(context.getBean("car250", String.class).hashCode());
		System.out.println(context.getBean("car251", String.class).hashCode());
		System.out.println(context.getBean("car252", String.class).hashCode());
		System.out.println(context.getBean("car253", String.class).hashCode());
		System.out.println(context.getBean("car254", String.class).hashCode());
		System.out.println(context.getBean("car255", String.class).hashCode());
		System.out.println(context.getBean("car256", String.class).hashCode());
		System.out.println(context.getBean("car257", String.class).hashCode());
		System.out.println(context.getBean("car258", String.class).hashCode());
		System.out.println(context.getBean("car259", String.class).hashCode());
		System.out.println(context.getBean("car260", String.class).hashCode());
		System.out.println(context.getBean("car271", String.class).hashCode());
		System.out.println(context.getBean("car272", String.class).hashCode());
		System.out.println(context.getBean("car273", String.class).hashCode());
		System.out.println(context.getBean("car274", String.class).hashCode());
		System.out.println(context.getBean("car275", String.class).hashCode());
		System.out.println(context.getBean("car276", String.class).hashCode());
		System.out.println(context.getBean("car277", String.class).hashCode());
		System.out.println(context.getBean("car278", String.class).hashCode());
		System.out.println(context.getBean("car279", String.class).hashCode());
		System.out.println(context.getBean("car280", String.class).hashCode());
		System.out.println(context.getBean("car281", String.class).hashCode());
		System.out.println(context.getBean("car282", String.class).hashCode());
		System.out.println(context.getBean("car283", String.class).hashCode());
		System.out.println(context.getBean("car284", String.class).hashCode());
		System.out.println(context.getBean("car285", String.class).hashCode());
		System.out.println(context.getBean("car286", String.class).hashCode());
		System.out.println(context.getBean("car287", String.class).hashCode());
		System.out.println(context.getBean("car288", String.class).hashCode());
		System.out.println(context.getBean("car289", String.class).hashCode());
		System.out.println(context.getBean("car290", String.class).hashCode());
		System.out.println(context.getBean("car291", String.class).hashCode());
		System.out.println(context.getBean("car292", String.class).hashCode());
		System.out.println(context.getBean("car293", String.class).hashCode());
		System.out.println(context.getBean("car294", String.class).hashCode());
		System.out.println(context.getBean("car295", String.class).hashCode());
		System.out.println(context.getBean("car296", String.class).hashCode());
		System.out.println(context.getBean("car297", String.class).hashCode());
		System.out.println(context.getBean("car298", String.class).hashCode());
		System.out.println(context.getBean("car299", String.class).hashCode());
		System.out.println(context.getBean("car300", String.class).hashCode());
		System.out.println(context.getBean("car301", String.class).hashCode());
		System.out.println(context.getBean("car302", String.class).hashCode());
		System.out.println(context.getBean("car303", String.class).hashCode());
		System.out.println(context.getBean("car304", String.class).hashCode());
		System.out.println(context.getBean("car305", String.class).hashCode());
		System.out.println(context.getBean("car306", String.class).hashCode());
		System.out.println(context.getBean("car307", String.class).hashCode());
		System.out.println(context.getBean("car308", String.class).hashCode());
		System.out.println(context.getBean("car309", String.class).hashCode());
		System.out.println(context.getBean("car310", String.class).hashCode());
		System.out.println(context.getBean("car311", String.class).hashCode());
		System.out.println(context.getBean("car312", String.class).hashCode());
		System.out.println(context.getBean("car313", String.class).hashCode());
		System.out.println(context.getBean("car314", String.class).hashCode());
		System.out.println(context.getBean("car315", String.class).hashCode());
		System.out.println(context.getBean("car316", String.class).hashCode());
		System.out.println(context.getBean("car317", String.class).hashCode());
		System.out.println(context.getBean("car318", String.class).hashCode());
		System.out.println(context.getBean("car319", String.class).hashCode());
		System.out.println(context.getBean("car320", String.class).hashCode());
		System.out.println(context.getBean("car321", String.class).hashCode());
		System.out.println(context.getBean("car322", String.class).hashCode());
		System.out.println(context.getBean("car323", String.class).hashCode());
		System.out.println(context.getBean("car324", String.class).hashCode());
		System.out.println(context.getBean("car325", String.class).hashCode());
		System.out.println(context.getBean("car326", String.class).hashCode());
		System.out.println(context.getBean("car327", String.class).hashCode());
		System.out.println(context.getBean("car328", String.class).hashCode());
		System.out.println(context.getBean("car329", String.class).hashCode());
		System.out.println(context.getBean("car330", String.class).hashCode());
		System.out.println(context.getBean("car331", String.class).hashCode());
		System.out.println(context.getBean("car332", String.class).hashCode());
		System.out.println(context.getBean("car333", String.class).hashCode());
		System.out.println(context.getBean("car334", String.class).hashCode());
		System.out.println(context.getBean("car335", String.class).hashCode());
		System.out.println(context.getBean("car336", String.class).hashCode());
		System.out.println(context.getBean("car337", String.class).hashCode());
		System.out.println(context.getBean("car338", String.class).hashCode());
		System.out.println(context.getBean("car339", String.class).hashCode());
		System.out.println(context.getBean("car340", String.class).hashCode());
		System.out.println(context.getBean("car341", String.class).hashCode());
		System.out.println(context.getBean("car342", String.class).hashCode());
		System.out.println(context.getBean("car343", String.class).hashCode());
		System.out.println(context.getBean("car344", String.class).hashCode());
		
		

	}

}
