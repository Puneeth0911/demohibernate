package com.alpha.ManyToOne_OneToMany_Bidrirectional;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete_company_using_empid {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
			Employee e=em.find(Employee.class,104);
			if(e!=null) {
				int companyid=e.getComp().getId();
				System.out.println(companyid);
				Company comp=e.getComp(); 
				List<Employee> elist=comp.getElist();
				for(Employee emp:elist) {
					emp.setComp(null);
					em.merge(emp);
				}
//				comp.setElist(null);
//				em.merge(comp);   
				Company c=em.find(Company.class,companyid);
				em.remove(c);
				System.out.println("Deleted");
			}
		et.commit(); 
	}
}
