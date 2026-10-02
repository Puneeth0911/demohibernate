package com.alpha.OneToMany;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.alpha.demo.Student;

public class Save_Student_School {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s1=new Student(101,"Allen",23,70.5);
		Student s2=new Student(102,"Kevin",24,80.5);
		Student s3=new Student(103,"King",25,90.5);
		Student s4=new Student(104,"Rohith",24,85.5);
		Student s5=new Student(105,"Amit",23,85.5);
		Student s6=new Student(106,"Mahesh",21,70.5);
		
		School sch1=new School(201,"QSP","HYD",Arrays.asList(s1,s2,s3));
		School sch2=new School(202,"JSP","DSNR",Arrays.asList(s4,s5,s6));
		
		et.begin();
//			Student s=em.find(Student.class, 105);
//			System.out.println(s);
			em.persist(s1);
			em.persist(s2);
			em.persist(s3);
			em.persist(s4);
			em.persist(s5);
			em.persist(s6);
			em.persist(sch1);
			em.persist(sch2);
		et.commit();
		
	}
}
