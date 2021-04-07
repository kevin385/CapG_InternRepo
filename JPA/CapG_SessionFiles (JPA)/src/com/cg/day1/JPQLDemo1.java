package com.cg.day1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class JPQLDemo1 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		//Query
		Query q1 = em.createQuery("select s from Student s");
		List<Student> l = q1.getResultList();
		for(Student s: l)
			System.out.println(s);
		
		//TypedQuery
		TypedQuery<Student> q2 = em.createQuery("select s from Student s", Student.class);
		List<Student> st = q2.getResultList();
		
		em.getTransaction().commit();
		em.clear();
		

	}

}
