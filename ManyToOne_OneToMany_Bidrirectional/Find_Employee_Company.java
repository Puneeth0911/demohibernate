package com.alpha.ManyToOne_OneToMany_Bidrirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Find_Employee_Company {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		Company c=em.find(Company.class, 201);
		System.out.println(c);
		System.out.println(c.getElist());
		
		Employee e=em.find(Employee.class, 101);
		System.out.println(e);
			
		et.commit();
	}
}
