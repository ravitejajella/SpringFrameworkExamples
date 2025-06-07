package com.ravitejajella;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class HeadOfChief implements Staff{

	@Override
	public void assist() {
		System.out.println("Head of chief will assists");		
	}
	
	private String q;

	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
	}
	
	

}
