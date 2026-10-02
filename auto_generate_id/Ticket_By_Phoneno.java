package com.alpha.auto_generate_id;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Ticket_By_Phoneno {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
			String query="SELECT p FROM Passenger p WHERE p.phone=987654";
			Passenger p=(Passenger) em.createQuery(query).getSingleResult();
			System.out.println(p.getT());
		et.commit();
	}
}
