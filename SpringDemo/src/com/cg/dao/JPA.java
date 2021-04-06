package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPA implements DaoI {

	@Override
	public void connectionFunc() {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
//		EntityManager em = emf.createEntityManager();
//		em.getTransaction().begin();
//		
//		
//		em.getTransaction().commit();
		System.out.println("Connecting via JPA");
	}
	
}
