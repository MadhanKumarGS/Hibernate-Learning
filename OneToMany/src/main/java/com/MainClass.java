package com;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


public class MainClass {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction  et=em.getTransaction();
		
		Department d1=new Department();
		
		d1.setDeptName("Mechanical");
		d1.setHod("sanmugasundaram");
		d1.setNoOfStudents(200);
		d1.setFees(100000);
		
		Department d2=new Department();
		
		d2.setDeptName("CSE");
		d2.setHod("parvathi");
		d2.setNoOfStudents(150);
		d2.setFees(130000);
		
		Department d3=new Department();
		
		d3.setDeptName("EEE");
		d3.setHod("teriyadusir");
		d3.setNoOfStudents(80);
		d3.setFees(120000);
		
		List<Department>list=new ArrayList<Department>();
		
		list.add(d1);
		list.add(d2);
		list.add(d3);
		
		
		College c=new College();
		
	    c.setCollegename("ACE");
	    c.setLocation("Kalavai");
	    c.setEmail("ace@gmail.com");
	    c.setContact(923456789);
	    c.setDepartments(list);
	    
	    
	    et.begin();
	    em.persist(c);
	  
	    et.commit();
	    
	    
	    System.out.println("data saved");
	    
	    
		
		
		
	}

}
