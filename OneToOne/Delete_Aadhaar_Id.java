package com.alpha.OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete_Aadhaar_Id {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
			// Directly deleting aadhaar id not possible
//			Aadhaar a=em.find(Aadhaar.class, 101);
//			em.remove(a);
			
			Citizen c=em.find(Citizen.class, 201);
			if(c!=null) {
				int aadhaarid=c.getAadhaar().getId();
				System.out.println(aadhaarid); //101
				c.setAadhaar(null);  
				em.merge(c);
	
				Aadhaar a=em.find(Aadhaar.class, aadhaarid);
				em.remove(a);
				System.out.println("Deleted");
			}
		et.commit();
	}
}
