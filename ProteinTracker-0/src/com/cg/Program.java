package com.cg;

import org.hibernate.Session;

public class Program {
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		Session session = HibernateUtilities.getSessionFactory().openSession();
		
		System.out.println("Session started: "+ session.isConnected());
		System.out.println(session.getSessionFactory());
		session.close();
	}
}
