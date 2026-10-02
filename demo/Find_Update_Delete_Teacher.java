package com.alpha.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Find_Update_Delete_Teacher {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
			Teacher t=em.find(Teacher.class, 1);
			if(t!=null) {
				// Update
//				t.setName("Ajith sir");
				//Delete
				em.remove(t);
			}	
		et.commit();
			System.out.println(t);
	}
}
