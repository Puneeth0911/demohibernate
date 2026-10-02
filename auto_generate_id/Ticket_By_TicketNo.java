package com.alpha.auto_generate_id;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Ticket_By_TicketNo {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
			String query="SELECT t FROM Ticket t where t.ticketno=1234";
			Ticket t=(Ticket) em.createQuery(query).getSingleResult();
			System.out.println(t);
		et.commit();
	}
}
