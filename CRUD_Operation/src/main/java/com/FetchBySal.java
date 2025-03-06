package com;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchBySal {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		
		EntityManager em=emf.createEntityManager();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the start salary");
		double start=sc.nextDouble();
		System.out.println("enter the end salary");
		double end=sc.nextDouble();
		
		  Query q=em.createQuery("select e from employee e where salary between ?1 and ?2");
		  q.setParameter(1, start);
		  q.setParameter(2, end);
		  
		 List <Employee> List = q.getResultList();
		 
		 for(Employee e: List) {
			 System.out.println(e);
		 }
		  
		
		
		
		
	}

}
