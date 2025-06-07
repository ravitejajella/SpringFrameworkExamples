package com.rjella;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

	
	public void checkout() {
		System.out.println("Checkout method from shopping cart is called");
	}
	public void checkout(String Status) {
		System.out.println("Checkout method with arguments from shopping cart is called" +Status);
	}
}
