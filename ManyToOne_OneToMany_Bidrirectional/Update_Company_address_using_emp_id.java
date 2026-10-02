package com.alpha.ManyToOne_OneToMany_Bidrirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update_Company_address_using_emp_id {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
			Employee e=em.find(Employee.class, 104);
			if(e!=null) {
				e.setSalary(10000);
				e.getComp().setAddress("Banglore");
				em.merge(e);
			}

		et.commit();
	}
}
