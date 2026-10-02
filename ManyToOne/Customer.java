package com.alpha.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Customer {
	@Id
	private int id;
	private String name;
	private int age;
	
	@ManyToOne
	private Bank bank;

	public Customer() {
		super();
	}

	public Customer(int id, String name, int age, Bank bank) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.bank = bank;
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

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", bank=" + bank + "]";
	}
	
	
	
}
