package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Address;
import com.cg.entity.Employee;

public class Client {	//client

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Address ad = new Address();
		ad.setAddressId(100);
		ad.setStreetName("btm");
		ad.setPinCode(75665);
		
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("rahul");
		e1.setDesignation("hr");
		e1.setSalary(45000);
		e1.setAddress(ad);
		
		em.persist(e1);
		
		System.out.println("Employee object inserted successfully");
		
		em.getTransaction().commit();
	}

}
