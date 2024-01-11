package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.MyUser;

public class TestRetrieveddata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		
		MyUser m1= sess.load(MyUser.class, 1);
		System.out.println("Before");
		System.out.println(m1.getUname());
		System.out.println("After name");
		System.out.println(m1.getAddr());
		System.out.println("After");
	}

}
