package com.alpha.auto_generate_id;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save_Passenger_Ticket {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Ticket t1=new Ticket(1234,"3-AC");
		Passenger p1=new Passenger("Allen",23,'M',123456,t1);
		Ticket t2=new Ticket(9876,"2-AC");
		Passenger p2=new Passenger("Kevin",24,'M',987654,t2);
		
		et.begin();
			em.persist(t1);
			em.persist(p1);
			em.persist(t2);
			em.persist(p2);
		et.commit();
	}
}
