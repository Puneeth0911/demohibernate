package com.alpha.ManyToOne_OneToMany_Bidrirectional;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {
	@Id
	private int id;
	private String name;
	private String address;
	
	@OneToMany(mappedBy = "comp")
	List<Employee>elist;

	public Company(int id, String name, String address, List<Employee> elist) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.elist = elist;
	}

	public Company() {
		super();
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Employee> getElist() {
		return elist;
	}

	public void setElist(List<Employee> elist) {
		this.elist = elist;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
