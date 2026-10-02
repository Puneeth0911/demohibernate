package com.alpha.auto_generate_id;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save_Candidate {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Candidate c=new Candidate("Rohit",29,963852);
		et.begin();
			em.persist(c);
		et.commit();
	}
}
