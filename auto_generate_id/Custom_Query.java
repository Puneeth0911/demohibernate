package com.alpha.auto_generate_id;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Custom_Query {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
//			String query="select c from Candidate c where c.phone=123456";
			String query="SELECT c FROM Candidate c WHERE c.phone=123456";
			Candidate c=(Candidate) em.createQuery(query).getSingleResult();
			System.out.println(c.getId()); 
			System.out.println(c.getName());
			System.out.println(c.getPhone());
			System.out.println(c.getAge()); 
		et.commit();
	}
}
