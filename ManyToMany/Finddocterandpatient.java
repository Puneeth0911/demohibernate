package com.alpha.ManyToMany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Finddocterandpatient {
public static void main(String[] args) {
	
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
     EntityManager em = emf.createEntityManager();
     EntityTransaction et = em.getTransaction();
     
     et.begin();
     
     Patients p1 = em.find(Patients.class, 201);
     Patients p2= em.find(Patients.class, 202);
     
     Doctor d1 = em.find(Doctor.class, 103);
     Doctor d2 = em.find(Doctor.class, 102);
     
     System.out.println(p1);
     System.out.println(p2);
     
     System.out.println(d1);
     System.out.println(d2);
     
     
     et.commit();
}
}