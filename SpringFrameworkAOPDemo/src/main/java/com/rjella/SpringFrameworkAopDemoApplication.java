package com.rjella;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringFrameworkAopDemoApplication {

	public static void main(String[] args) {
	
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigFile.class);
		ShoppingCart sc = context.getBean(ShoppingCart.class);
		sc.checkout();
		sc.checkout("cancel");
	}

}
