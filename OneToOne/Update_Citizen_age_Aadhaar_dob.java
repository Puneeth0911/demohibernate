package com.alpha.OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update_Citizen_age_Aadhaar_dob {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		Citizen c=em.find(Citizen.class, 201);
		if(c!=null) {
			c.setAge(26);
			c.getAadhaar().setDob("12-Nov");
			em.merge(c);
		} 
		et.commit();
	}
}
