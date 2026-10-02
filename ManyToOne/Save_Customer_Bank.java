package com.alpha.ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save_Customer_Bank {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Bank b=new Bank(101,"Axis","Hyd");
		Customer c1=new Customer(201,"Amit",25,b);
		Customer c2=new Customer(202,"Rohit",23,b);
		Customer c3=new Customer(203,"Mahesh",22,b);
		
		et.begin();
			em.persist(b);
			em.persist(c1);
			em.persist(c2);
			em.persist(c3);
		et.commit();
	}
}
