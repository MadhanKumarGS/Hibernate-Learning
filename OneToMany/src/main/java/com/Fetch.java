package com;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Fetch {
	
	public static void main(String[] args) {
		

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		
		College c=em.find(College.class, 1);
		
	    List<Department>list=	c.getDepartments();
	    
	    System.out.println(c);
	    
	    for(Department d:list) {
	    	
	    	System.out.println(d);
	    }
		
	}

}
