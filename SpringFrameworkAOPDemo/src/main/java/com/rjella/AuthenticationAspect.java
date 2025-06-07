package com.rjella;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuthenticationAspect {

	
	@Pointcut("within(com.rjella.ShoppingCart)")
	public void authenticationPointCut() {
		
	}
	
	@Pointcut("within(com.rjella.ShoppingCart)")
	public void authorizationPointCut() {
		
	}
	
	@Before("authenticationPointCut() && authorizationPointCut()")
	public void authenticate() {
		System.out.println("Authenticating the request");
	}
	
	
	
}
