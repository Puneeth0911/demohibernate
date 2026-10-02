package com.alpha.OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Cascade {
public static void main(String[] args) {
	
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
     EntityManager em = emf.createEntityManager();
     EntityTransaction et = em.getTransaction();
    
     et.begin();
     
     Citizen c1 = em.find(Citizen.class, 207);
     System.out.println(c1);
     
     if(c1!=null) {
//    	 c1.setName("Surya");
    	 em.remove(c1);
     }
     
     
     //EXCEPTION ,WE CAN NOT REMOVE AADHAR BECAUSE IT HAS IS A RELATIONSHIP WITH CITIZEN AND WE CAN REMOVE CITIZEN DIRECTLY IF WE WANT  
//     Adhar a = em.find(Adhar.class, 106);
//     
//     if(a!=null) {
//    	 em.remove(a);
//     }   
     
     et.commit();
}
}
