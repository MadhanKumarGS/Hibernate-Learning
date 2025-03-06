package com;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Fetch {
	
	public static void main(String[] args) {
		

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Passanger p=em.find(Passanger.class, 1);
		
		Train t=p.getTrain();
		
		System.out.println(p);
		
		System.out.println(t);
	}

}



