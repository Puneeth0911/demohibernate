package com.alpha.OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Citizen {
	@Id
	private int id;
	private String name;
	private int age;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Aadhaar aadhaar;
	
	public Citizen() {
		super();
	}

	public Citizen(int id, String name, int age, Aadhaar aadhaar) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.aadhaar = aadhaar;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Aadhaar getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(Aadhaar aadhaar) {
		this.aadhaar = aadhaar;
	}

	@Override
	public String toString() {
		return "Citizen [id=" + id + ", name=" + name + ", age=" + age + ", aadhaar=" + aadhaar + "]";
	}
	
}
