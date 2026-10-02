package com.alpha.auto_generate_id;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Passenger_By_Gender {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin(); 
			String query="SELECT p FROM Passenger p WHERE p.gender='M'";
			List<Passenger> l=em.createQuery(query).getResultList();
			for(Passenger p:l) {
				System.out.println(p);
			}
		et.commit();
	}
}