package com.alpha.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Patients {
	@Id
	private int id;
	private String name;
	private String disease;
	
	@ManyToMany
	List<Doctor> docter;

	public Patients(int id, String name, String disease, List<Doctor> docter) {
		super();
		this.id = id;
		this.name = name;
		this.disease = disease;
		this.docter = docter;
	}

	public Patients() {
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

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public List<Doctor> getDocter() {
		return docter;
	}

	public void setDocter(List<Doctor> docter) {
		this.docter = docter;
	}

//	@Override
//	public String toString() {
//		return "Patients [id=" + id + ", name=" + name + ", disease=" + disease + ", docter=" + docter + "]";
//	}
	
}