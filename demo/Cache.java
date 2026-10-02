package com.alpha.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Cache {
	public static void main(String[] args) {
		
		EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("app");
		EntityManager em1 = emf1.createEntityManager();
		EntityTransaction et1 = em1.getTransaction();

		et1.begin();

		Student s1 = em1.find(Student.class, 101);
		Student s2 = em1.find(Student.class, 101);
		Student s3 = em1.find(Student.class, 101);
		Student s4 = em1.find(Student.class, 101);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		et1.commit();

		EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("app");
		EntityManager em2 = emf2.createEntityManager();
		EntityTransaction et2 = em2.getTransaction();

		et2.begin();

		Student s11 = em1.find(Student.class, 101);
		Student s22 = em1.find(Student.class, 101);
		Student s33 = em1.find(Student.class, 101);
		Student s44 = em1.find(Student.class, 101);

		System.out.println(s11);
		System.out.println(s22);
		System.out.println(s33);
		System.out.println(s44);

		et2.commit();
	}
}