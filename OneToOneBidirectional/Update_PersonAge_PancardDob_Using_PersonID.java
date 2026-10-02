package com.alpha.OneToOneBidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update_PersonAge_PancardDob_Using_PersonID {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
			Person p=em.find(Person.class, 103);
			if(p!=null) {
				p.setAge(33);
				p.getPan().setDob("9-Nov");
				em.merge(p);
			}
		et.commit();
	}
}
