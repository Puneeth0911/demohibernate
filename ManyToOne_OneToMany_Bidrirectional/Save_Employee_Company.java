package com.alpha.ManyToOne_OneToMany_Bidrirectional;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save_Employee_Company {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Employee e1=new Employee(104,"Rohit",5000,null);
		Employee e2=new Employee(105,"Ramesh",8000,null);
		Employee e3=new Employee(106,"Suresh",500,null);
		List<Employee>elist=Arrays.asList(e1,e2,e3);
		Company comp=new Company(202,"Infosys","Hyd",elist);
		e1.setComp(comp);
		e2.setComp(comp);
		e3.setComp(comp);
		et.begin();
			em.persist(e1);
			em.persist(e2);
			em.persist(e3);
			em.persist(comp);
		et.commit();
	}
}
