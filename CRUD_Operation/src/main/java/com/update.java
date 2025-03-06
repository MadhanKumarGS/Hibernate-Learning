package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class update {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Employee e=em.find(Employee.class,1);
		
		System.out.println(e);
		
		if(e!=null) {
			e.setPhoneNo(34567678);
			e.setSal(100000);
			
			et.begin();
			em.merge(e);
			et.commit();
			System.out.println(e);
			
			System.out.println("Data updated");
		}else {
			System.out.println("id not found");
		}
		
	}

}
