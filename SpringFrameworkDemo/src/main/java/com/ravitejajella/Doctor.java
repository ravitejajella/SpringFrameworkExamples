package com.ravitejajella;

public class Doctor implements Staff{
	
	private String qualification;
	private Nurse nurse;
	
	
	
	
	public Doctor(String qualification, Nurse nurse) {
		super();
		this.qualification = qualification;
		this.nurse = nurse;
	}

	public Doctor() {
		// TODO Auto-generated constructor stub
	}

	public Nurse getNurse() {
		return nurse;
	}

	public void setNurse(Nurse nurse) {
		this.nurse = nurse;
	}

	public void assist() {
		System.out.println("Doctor is assisting");
	}
	
	public String getQualification() {
		return qualification;
	}
	
	public void setQualification(String s) {
		qualification=s;
	}

}
