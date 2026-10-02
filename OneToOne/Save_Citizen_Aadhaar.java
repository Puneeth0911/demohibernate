package com.alpha.OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save_Citizen_Aadhaar {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Aadhaar a=new Aadhaar(103,123456,"12-Dec");
		Citizen c=new Citizen(203,"Rohit",23,a);
		et.begin();
// 			em.persist(a);  
			em.persist(c);
		et.commit();
	}
}
