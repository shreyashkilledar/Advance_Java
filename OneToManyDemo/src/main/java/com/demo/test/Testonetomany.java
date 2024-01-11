package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Department;
import com.demo.model.Employee;

public class Testonetomany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee(1,"Bhagyashri",25000);
		Employee e2=new Employee(2,"shri",28000);
		Employee e3=new Employee(3,"Bhagya",35000);
		Employee e4=new Employee(4,"Bhavesh",58000);
		
		Set<Employee> set1=new HashSet<>();
		set1.add(e1);
		set1.add(e2);
		
		Set<Employee> set2=new HashSet<>();
		set1.add(e3);
		set1.add(e4);
		
		Department dept=new Department(1,"Design","AdminBuilding",set1);
		Department dept1=new Department(2,"NPD","AdminBuilding1",set2);
		
		e1.setDept(dept);
		e2.setDept(dept);
		e3.setDept(dept1);
		e4.setDept(dept1);
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		
		session.save(dept);
		session.save(dept1);
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		
		tr.commit();
		
	}

}
