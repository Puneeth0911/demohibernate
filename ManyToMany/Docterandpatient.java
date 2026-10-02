package com.alpha.ManyToMany;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Docterandpatient {
public static void main(String[] args) {
	
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
     EntityManager em = emf.createEntityManager();
     EntityTransaction et = em.getTransaction();
     
     et.begin();
     
     Doctor d1 = new Doctor(101,"Shekar","Orthology",null);
     Doctor d2 = new Doctor(102,"Mohan","Dentist",null);
     Doctor d3 = new Doctor(103,"Krishna","Phycatrist",null);
     
     Patients p1 = new Patients(201,"Allen","Fever",Arrays.asList(d1,d2));
     Patients p2 = new Patients (202,"Vini","Cold",Arrays.asList(d1,d3));
     Patients p3 = new Patients (203,"kamal","Headache",Arrays.asList(d2,d3));
     
     d1.setPatients(Arrays.asList(p1,p2));
     d2.setPatients(Arrays.asList(p1,p2));
     d2.setPatients(Arrays.asList(p2,p3));
     
     em.persist(d1);
     em.persist(d2);
     em.persist(d3);
     em.persist(p1);
     em.persist(p2);
     em.persist(p3);
     
     et.commit();
     
}
}