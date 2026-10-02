package com.alpha.OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Find_Aadhaar_Citizen {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
			Aadhaar a=em.find(Aadhaar.class, 101);
			System.out.println(a);
			
			Citizen c=em.find(Citizen.class, 201);
			System.out.println(c);
		et.commit();
	}
}
