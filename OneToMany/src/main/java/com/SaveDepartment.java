package com;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SaveDepartment {
	
	public static void main(String[] args) {
		
		
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction  et=em.getTransaction();
		
		College c=em.find(College.class, 1);
		
		if(c!=null) {
			
			List<Department>list=c.getDepartments();
			
			Department d1=new Department();
			d1.setDeptName("IT");
			d1.setHod("Ashok");
			d1.setNoOfStudents(100);
			d1.setFees(180000);
			
			list.add(d1);
			
			et.begin();
			em.persist(d1);
			em.persist(c);
			et.commit();
		}
		else {
			System.out.println("data not saved");
		}
	}

}
