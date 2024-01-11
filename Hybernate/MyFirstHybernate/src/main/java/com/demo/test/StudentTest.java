package com.demo.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Student s1= new Student(1,"Pratik","Lahor");
//		Student s2= new Student(2,"Prashant","Uganda");
//		Student s3= new Student(3,"Lala","UP");
//		Student s4= new Student(4,"Bhagat","Saidapur");
		
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session session= sf.openSession();
		Transaction tr= session.beginTransaction();
		
//		session.save(s1);
//		session.save(s2);
//		session.save(s3);
//		session.save(s4);
		
		tr.commit();
		

	}

}
