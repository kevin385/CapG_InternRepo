package com.cg.day2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class ProductClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Query q1 = em.createQuery("select p from Product p");
		List<Product> l1 = q1.getResultList();
		for(Product p: l1)
			System.out.println(p);
		
		
		System.out.println("\n=====Named Query=====");
		Query q2 = em.createNamedQuery("findAll2");
		List<Product> l2 = q2.getResultList();
		for(Product p: l2)
			System.out.println(p);
		
		System.out.println();
		Query q3 = em.createNamedQuery("findById2").setParameter("id", 2);
		Product p = (Product) q3.getSingleResult();
		System.out.println(p);
		
		System.out.println();
		TypedQuery<Product> product = em.createNamedQuery("findById2", Product.class).setParameter("id", 4);
		Product p2 = product.getSingleResult();
		System.out.println(p2);
		
		System.out.println();
		System.out.println("=====Aggregate Function=====");
		TypedQuery<Integer> Querymax = em.createQuery("select max(p.price) from Product p", Integer.class);
		Integer max = Querymax.getSingleResult();
		System.out.println("max = "+max);
		
		System.out.println();
		System.out.println("===Native Query===");
		Query productQuery = em.createNativeQuery("select * from product30", Product.class);
		List<Product> productList = productQuery.getResultList();
		for(Product p3: productList)
			System.out.println(p3);
		
		System.out.println();
		System.out.println("===Native Query===");
		Query productQuery1 = em.createNativeQuery("select * from product30 where price >30000", Product.class);
		List<Product> productList1 = productQuery1.getResultList();
		for(Product p3: productList1)
			System.out.println(p3);
		
		em.getTransaction().commit();

	}

}
