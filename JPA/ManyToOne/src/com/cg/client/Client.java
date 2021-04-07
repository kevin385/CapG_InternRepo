package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Department;
import com.cg.entity.Employee;

public class Client {	//client

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Department d1 = new Department();
		d1.setDeptId(100); 
		d1.setDeptName("hr");
		
		Employee e = new Employee();
		e.setEmpId(1);
		e.setEmpName("suresh");
		e.setSalary(46000);
		e.setDepartment(d1);
		
		Employee e1 = new Employee();
		e1.setEmpId(2);
		e1.setEmpName("mahesh");
		e1.setSalary(52000);
		e1.setDepartment(d1);
		
		em.persist(e);
		em.persist(e1);
		
		em.getTransaction().commit();
		
		System.out.println("Inserted");
	}

}
