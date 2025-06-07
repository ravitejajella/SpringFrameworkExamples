package com.ravitejajella;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFrameworkDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Doctor d = context.getBean(Doctor.class);
		//Using with the property 
		d.assist();
		d.getNurse().assist(); //Passing another class using ref 
		System.out.println(d.getQualification());// passing the value using property 
		
		Nurse n = (Nurse) context.getBean("nurse");
		n.assist();
		
		//Using interface to call objects
		Staff s = context.getBean(Nurse.class);
		s.assist();
		
		//Now using the componentscan and annotations
			
		HeadOfChief h = context.getBean(HeadOfChief.class);
		h.assist();
		
		
		//We can also do the same using the Java classes using @configuration and componentscan annotioans
		ApplicationContext context1 = new AnnotationConfigApplicationContext(BeanConfig.class);
		HeadOfChief h1 = context1.getBean(HeadOfChief.class);
		h1.assist();
		
	
		h1.setQ("MD");
		HeadOfChief h2= context1.getBean(HeadOfChief.class);
		System.err.println(h1.getQ()); // we will get MD twice if the scope is singleton
		System.out.println(h2.getQ()); // we will get null here when scope is prototype
		
	}

}
