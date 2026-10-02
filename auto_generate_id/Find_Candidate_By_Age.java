package com.alpha.auto_generate_id;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Find_Candidate_By_Age {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
			String query="SELECT c FROM Candidate c WHERE c.age=23";
			List<Candidate> candidates=em.createQuery(query).getResultList();
			for(Candidate candidate:candidates) {
				System.out.println(candidate);
			}      
		et.commit();
	}
}
