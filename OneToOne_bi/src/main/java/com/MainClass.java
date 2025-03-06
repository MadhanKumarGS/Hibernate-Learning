package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainClass {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		person p=new person();
		p.setName("Madhan");
		p.setEmail("madhan12@gmail.com");
		p.setGender("male");
		p.setPhone(923456756);
		
		Adharcard a=new Adharcard();
		
		a.setAno(234567890);
		a.setFatherName("Gangadharan");
		a.setDob("12/01/2002");
		a.setPerson(p);
		
		et.begin();
		em.persist(p);
		em.persist(a);
		et.commit();
		
		System.out.println("data saved");
		
		
		
		
	}

}
