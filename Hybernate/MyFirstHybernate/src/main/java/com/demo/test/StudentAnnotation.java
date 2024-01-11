package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Student;

public class StudentAnnotation 
{

	public static void main(String[] args)
	{
//		Student p1=new Student(1,"SK","Karad");
//		Student p2=new Student(2,"RP","Sangli");
		Student p3=new Student(3,"BS","Pathan");
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
//		session.save(p1);
//		session.save(p2);
		session.save(p3);
		tr.commit();
		session.close();
		sf.close();
	}
}