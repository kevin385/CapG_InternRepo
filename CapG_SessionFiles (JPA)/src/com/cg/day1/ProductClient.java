package com.cg.day1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProductClient {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("s");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		Product s=new Product();
		s.setId(1);
		s.setName("book");
		s.setPrice(50);
		
		em.persist(s);// it will make one row in the database
		System.out.println("record inserted");
		em.getTransaction().commit();
	}
}
