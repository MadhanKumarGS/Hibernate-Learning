package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateCollege {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction  et=em.getTransaction();
		
		College c=em.find(College.class, 1);
		
		if(c!=null) {
			
		c.setCollegename("VIT");
		c.setEmail("vit@gmail.com");
		c.setLocation("Vellore");
		c.setContact(987345678);
		
		et.begin();
		em.merge(c);
		et.commit();
		
		
		System.out.println("data updated");
		
		}
		else {
			System.out.println("data not saved");
		}
	}

}
