package com.cg.client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Manager;
import com.cg.entity.Employee;

public class Client {	//client

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin(); 
		
		Employee e1 = new Employee();
		e1.setEmpId(1);
		e1.setEmpName("suresh");
		
		Employee e2 = new Employee();
		e2.setEmpId(2);
		e2.setEmpName("ravi");
		
		List<Employee> eList = new ArrayList<Employee>();
		eList.add(e1);
		eList.add(e2);
		
		Manager m1 = new Manager();
		m1.setManagerId(200);
		m1.setManagerName("John");
		m1.setEmployeeList(eList);
		
		em.persist(m1);
		
		em.getTransaction().commit();
		
		System.out.println("Inserted");
	}

}
