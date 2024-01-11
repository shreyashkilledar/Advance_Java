package com.demo.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.demo.model.Employee;

public class EmployeeTest
{
	public static void main(String[] args) {
		
//		Employee e1= new Employee(1,"Bhagyashri",2500.2);
//		Employee e2= new Employee(2,"Shreyash",50000);
//		Employee e3= new Employee(3,"Rutvik",10000);
//		Employee e4= new Employee(4,"Rutvik",10000);
		Employee e5= new Employee(5,"Ankita",100500);
	
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session session= sf.openSession();
		Transaction tr= session.beginTransaction();
		
//		session.save(e1);
//		session.save(e2);
//		session.save(e3);
//		session.save(e4);
		session.save(e5);
		
		tr.commit();
		session.close();
		
	}
}
