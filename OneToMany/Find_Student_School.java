package com.alpha.OneToMany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.alpha.demo.Student;

public class Find_Student_School {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
			// find student
			Student s=em.find(Student.class,101);
			System.out.println(s);
			
			// find school
			School sch=em.find(School.class, 201);
			System.out.println(sch);
			
			System.out.println(sch.getSlist());
			
		et.commit();
	}
}
