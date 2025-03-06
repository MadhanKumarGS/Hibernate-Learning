package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateTrain {
	
	public static void main(String[] args) {
		

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		

		Train t=em.find(Train.class, 1);
		
		if(t!=null) {
			
			t.setName("Kovai Express");
			t.setDeparture("Chennai Express");
			t.setArrival("coimbatore");
			t.setTiming("10.30pm");
			
			et.begin();
			em.merge(t);
			et.commit();
			
		
		System.out.println("data updated");
		
		}
		else {
			System.out.println("data not saved");
		}
	}

}
