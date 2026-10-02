package com.alpha.ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Find_Customer_Bank {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
			Bank b=em.find(Bank.class, 101);
			System.out.println(b);
			
			Customer c=em.find(Customer.class, 201);
			System.out.println(c);
		et.commit();
	}
}
