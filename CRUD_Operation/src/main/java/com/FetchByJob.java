package com;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchByJob {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("select job");
		String job=sc.next();
		
		Query q=em.createQuery("select e from Employee e where e.job= :j");
		q.setParameter("j", job);
		
		List <Employee> list=q.getResultList();
		
		for(Employee e:list) {
			
			System.out.println(e);
		}
		
		
		
	}
}
