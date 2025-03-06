package com;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchByNumber {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
//		Query q=em.createQuery("select e from Employee e where e.phoneNo=34567678");
//		
//		Object o=q.getSingleResult();
//		
//		Employee e=(Employee)o;
//		
////		System.out.println(e);
//		
//		if( o==e) {
//			System.out.println(e);
//			System.out.println("data present");
//		}
//		else {
//			System.out.println("data  not present");
//		}

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		long phoneNo=sc.nextLong();
		
		
		 Query q=em.createQuery("select e from Employee e where e.phoneNo=?1");
		 
		 q.setParameter(1,phoneNo);
		 
		 Object o=q.getSingleResult();
		 
		 Employee e=(Employee)o;
		 
		 if(o==e) {
			 System.out.println(e);
			 System.out.println("data is present");
			 
		 }
		 else {
			 System.out.println("data is not present");
		 }
		 
		 
		
	
	}
	
}
