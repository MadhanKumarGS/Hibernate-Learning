package com;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Mainclass {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Address a=new Address();
		a.setStreet("1/0 new Street");
		a.setCity("Ranipet");
		a.setState("Tamilnadu");
		a.setPincode(632513);
		
		person p=new person();
		
		p.setName("Madhan kumar");
		p.setEmail("madhan20020112@gmail.com");
		p.setGender("male");
		p.setPhone(45678993);
		
		et.begin();
		em.persist(a);
		em.persist(p);
		et.commit();
		
		System.out.println("data saved...");
	}

}
