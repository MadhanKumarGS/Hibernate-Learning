package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Fetchperson {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		person p=em.find(person.class, 1);
		
		Adharcard a=p.getAdharcard();
		
		
		System.out.println(p);
		System.out.println(a);
		
	}

}
