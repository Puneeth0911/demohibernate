package com.alpha.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aadhaar {
	@Id
	private int id;
	private int aadhaar;
	private String dob;
	
	
	public Aadhaar() {
		super();
	}

	public Aadhaar(int id, int aadhaar, String dob) {
		super();
		this.id = id;
		this.aadhaar = aadhaar;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(int aadhaar) {
		this.aadhaar = aadhaar;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Aadhaar [id=" + id + ", aadhaar=" + aadhaar + ", dob=" + dob + "]";
	}
	
}
