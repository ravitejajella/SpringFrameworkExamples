package com.ravitejajella;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com")
public class BeanConfig {

	
	//We do not want to use the component scan this is just like the xml based config
	public Doctor getDoctor() {
		return new Doctor();
	}
}
