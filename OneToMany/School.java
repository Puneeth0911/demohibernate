package com.alpha.OneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.alpha.demo.Student;

@Entity
public class School {
	@Id
	private int id;
	private String name;
	private String address;
	@OneToMany
	private List<Student> slist;
	
	public School() {
		super();
	}

	public School(int id, String name, String address, List<Student> slist) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.slist = slist;
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

	public List<Student> getSlist() {
		return slist;
	}

	public void setSlist(List<Student> slist) {
		this.slist = slist;
	}

	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", address=" + address + ", slist=" + slist + "]";
	}

}
