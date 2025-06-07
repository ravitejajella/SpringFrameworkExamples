package com.rjella;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Before("execution(* com.rjella.ShoppingCart.checkout())")
	public void beforeLogger() {
		System.out.println("Before logger");
	}
	@After("execution(* *.*.*.checkout() )")
	public void afterLogger() {
		System.out.println("After logger");
	}
	
	@Before("execution(* com.rjella.ShoppingCart.checkout(String))")
	public void beforeLoggerforCheckoutMethod(JoinPoint jp) {
		System.out.println(jp.getArgs()[0].toString());
		System.out.println("Before Logger for checkout method with arguments");
	}

}
