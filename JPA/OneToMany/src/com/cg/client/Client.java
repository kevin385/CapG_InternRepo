package com.cg.client;

import java.util.ArrayList;
import java.util.List;

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
		
		Employee e1 = new Employee();
		e1.setEmpId(1);
		e1.setEmpName("suresh");
		e1.setSalary(46000);
		
		Employee e2 = new Employee();
		e2.setEmpId(2);
		e2.setEmpName("ravi");
		e2.setSalary(52000);
		
		List<Employee> eList = new ArrayList<Employee>();
		eList.add(e1);
		eList.add(e2);
		
		Department d1 = new Department();
		d1.setDeptId(100);
		d1.setDeptName("hr");
		d1.setEmployeeList(eList);
		
		em.persist(d1);
		
		em.getTransaction().commit();
		
		System.out.println("Inserted");
	}

}
