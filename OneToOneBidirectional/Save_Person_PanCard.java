package com.alpha.OneToOneBidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save_Person_PanCard {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		Person per=new Person(101,"Allen",23,null);
//		PanCard pan=new PanCard(201,"ABC123","14-May",per);
//		per.setPan(pan);
		
		Person per=new Person(103,"Ravi",23,null);
		PanCard pan=new PanCard(203,"XYZ999","9-May",per);
		per.setPan(pan);
		
		et.begin();
			em.persist(per);
			em.persist(pan);
		et.commit();
	}
}
