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
		
		Train t=new Train();
		t.setName("Pandiyan Express");
		t.setDeparture("Chennai Central");
		t.setArrival("Madurai");
		t.setTiming("9.30pm");
		
		Passanger p1=new Passanger();
		p1.setName("Karthik Mohan");
		p1.setGender("male");
		p1.setEmail("karthimohan@gmail.com");
		p1.setAge(23);
		p1.setPhone(987654);
		p1.setTrain(t);
		

		Passanger p2=new Passanger();
		p2.setName("Santhosh");
		p2.setGender("male");
		p2.setEmail("santhosh@gmail.com");
		p2.setAge(22);
		p2.setPhone(9345676);
		p2.setTrain(t);
		
		Passanger p3=new Passanger();
		p3.setName("Madhan");
		p3.setGender("male");
		p3.setEmail("madhan@gmail.com");
		p3.setAge(23);
		p3.setPhone(63824567);
		p3.setTrain(t);
		
		et.begin();
		em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.persist(t);
        et.commit();
        
        
        System.out.println("data saved");
	}
}
