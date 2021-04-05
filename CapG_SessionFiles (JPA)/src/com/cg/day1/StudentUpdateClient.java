package com.cg.day1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentUpdateClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Student stu = em.find(Student.class, 1);
		if (stu!=null){
			System.out.println(stu.getId());
			System.out.println(stu.getDept());
			System.out.println(stu.getName());
			
			stu.setName("sachin");
			
			System.out.println("After update: ");
			System.out.println(stu.getId());
			System.out.println(stu.getDept());
			System.out.println(stu.getName());
			
			//em.remove(stu);
		}
		else {
			System.out.println("Object not found");
		}
		
		
		em.getTransaction().commit();

	}

}
