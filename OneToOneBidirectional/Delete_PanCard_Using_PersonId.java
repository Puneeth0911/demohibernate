package com.alpha.OneToOneBidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete_PanCard_Using_PersonId {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
			Person p=em.find(Person.class, 103);
			if(p!=null) {
				int panid=p.getPan().getId();
				p.setPan(null);
				em.merge(p);
				PanCard pan=em.find(PanCard.class, panid);
				em.remove(pan);
				System.out.println("Deleted");
			}
		et.commit();
	}
}
