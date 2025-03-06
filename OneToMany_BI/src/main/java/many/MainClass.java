package many;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainClass {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Batch b=new Batch();
		b.setName("E5");
		b.setSubject("java");
		b.setTrainer("Tabrez");
		b.setTotalNoStd(200);
		b.setTiming("10am");
		
		Student s1=new Student();
		s1.setName("madhan");
		s1.setGender("male");
		s1.setEmail("madhan12@gmail.com");
		s1.setAge(23);
		s1.setPhone(9876545);
		s1.setBatch(b);
		
		Student s2=new Student();
		s2.setName("karthik");
		s2.setGender("male");
		s2.setEmail("karthik112@gmail.com");
		s2.setAge(24);
		s2.setPhone(98765234);
		s2.setBatch(b);
		
		Student s3=new Student();
		s3.setName("santhosh");
		s3.setGender("male");
		s3.setEmail("santhosh@gmail.com");
		s3.setAge(22);
		s3.setPhone(56345678);
		s3.setBatch(b);
		
		List <Student> a1=new ArrayList <Student> ();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		b.setStudent(a1);
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(b);
		et.commit();
		
		System.out.println("data saved");
		
		
		
		
	}
 
}
