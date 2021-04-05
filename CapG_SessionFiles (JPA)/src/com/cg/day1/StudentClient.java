package com.cg.day1;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentClient {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("s");
		EntityManager em=emf.createEntityManager();

		em.getTransaction().begin();
		
		Student s1=new Student();
		s1.setId(3);
		s1.setName("john");
		s1.setDept("cse");
		
		em.persist(s1);// it will make one row in the database
		System.out.println("record inserted");
		em.getTransaction().commit();
	}
}
