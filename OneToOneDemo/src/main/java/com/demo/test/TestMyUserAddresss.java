package com.demo.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.demo.model.Address;
import com.demo.model.MyUser;

public class TestMyUserAddresss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add=new Address(1,"SB","Pune");
		Address add1=new Address(2,"MG","Mumba");
		MyUser m1=new MyUser(1,"shree",add);
		MyUser m2=new MyUser(2,"SK",add1);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		
		sess.save(add);
		sess.save(add1);
		sess.save(m1);
		sess.save(m2);
		
		tr.commit();
	}

}
