package com.example.springmew;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		// Create Hibernate configuration object
		Configuration config = new Configuration().configure();

		// Create Hibernate session factory object
		SessionFactory sessionFactory = config.buildSessionFactory();

		// Create Hibernate session object
		Session session = sessionFactory.openSession();


		User user = new User();
		user.setName("John");
		user.setId(1);
		User user2 = new User();
		user.setName("sebastian");
		user.setId(2);
		User user3 = new User();
		user.setName("Bob");
		user.setId(3);

		System.out.println(user);
		System.out.println(user2);
		System.out.println(user3);
		System.out.println("----------");
		System.out.println(user);
		System.out.println(user2);
		System.out.println(user3);
		System.out.println("----------");
		System.out.println(user);
		System.out.println(user2);
		System.out.println(user3);
		System.out.println("----------");
		System.out.println(user);
		System.out.println(user2);
		System.out.println(user3);
		System.out.println("----------");
		System.out.println(user);
		System.out.println(user2);
		System.out.println(user3);
		System.out.println("----------");

		session.beginTransaction();
//		session.save(user);
//		session.save(user2);
//		session.save(user3);
		session.getTransaction().commit();
//
//		 Close the Hibernate session
		session.close();
	}
//	public static void main(String[] args) {
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
//
//		User client = new User();
//		client.setId(2);
//		client.setName("bob");
//
//		Bank bank = new Bank();
//		bank.setName("wells fergo");
//
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		entityManager.getTransaction().begin();
//
//		entityManager.persist(client);
//		entityManager.persist(bank);
//		entityManager.getTransaction().commit();
//
//		entityManagerFactory.close();
//
//	}
}
