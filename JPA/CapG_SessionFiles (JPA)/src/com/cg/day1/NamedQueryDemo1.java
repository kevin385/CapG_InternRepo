package com.cg.day1;

import java.util.List;

import javax.persistence.*;

public class NamedQueryDemo1 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Query q = em.createNamedQuery("findAllById");
		List<Student> l = q.getResultList();
		System.out.println(l);

	}

}
