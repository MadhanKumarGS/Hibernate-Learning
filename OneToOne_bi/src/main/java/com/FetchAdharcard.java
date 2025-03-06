package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchAdharcard {
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Adharcard a=em.find(Adharcard.class, 234567890);
		
		person p=a.getPerson();
		
		
		System.out.println(p);
		System.out.println(a);
		
	}
}

