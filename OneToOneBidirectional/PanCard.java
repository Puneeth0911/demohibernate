package com.alpha.OneToOneBidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PanCard {
	@Id
	private int id;
	private String panno;
	private String dob;
	
	@OneToOne
	Person per;

	public PanCard(int id, String panno, String dob, Person per) {
		super();
		this.id = id;
		this.panno = panno;
		this.dob = dob;
		this.per = per;
	}

	public PanCard() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPanno() {
		return panno;
	}

	public void setPanno(String panno) {
		this.panno = panno;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Person getPer() {
		return per;
	}

	public void setPer(Person per) {
		this.per = per;
	}
	
}
