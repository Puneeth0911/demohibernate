package com.alpha.ManyToMany;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Doctor {
	
	@Id
	private int id;
	private String name;
	private String spec;

	@ManyToMany
	List<Patients> patients;

	public Doctor(int id, String name, String spec, List<Patients> patients) {
		super();
		this.id = id;
		this.name = name;
		this.spec = spec;
		this.patients = patients;
	}

	public Doctor() {
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

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public List<Patients> getPatients() {
		return patients;
	}

	public void setPatients(List<Patients> patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", spec=" + spec + ", patients=" + patients + "]";
	}

}