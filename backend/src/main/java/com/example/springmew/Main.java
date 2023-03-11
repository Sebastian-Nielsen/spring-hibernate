package com.example.springmew;

import com.example.springmew.user.User;
import com.example.springmew.user.UserRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.SQLIntegrityConstraintViolationException;

public class Main {
	public static void main(String[] args) throws SQLIntegrityConstraintViolationException {
		// Create Hibernate configuration object
		Configuration config = new Configuration().configure();

		// Create Hibernate session factory object
		SessionFactory sessionFactory = config.buildSessionFactory();

		// Create Hibernate session object
		Session session = sessionFactory.openSession();


		User user = new User();
		user.setFirstName("John");
		user.setId(1L);

		User user2 = new User();
		user2.setFirstName("Sebastian");
		user2.setId(2L);

		User user3 = new User();
		user3.setFirstName("Bob");
		user3.setId(3L);


		UserRepository userRepository = new UserRepository();
		userRepository.save(user);
		userRepository.save(user2);
		userRepository.save(user3);

//		session.persist(user);
//		session.persist(user2);
//		session.persist(user3);
//		config = new Configuration().configure();
//		sessionFactory = config.buildSessionFactory();
//		config = new Configuration().configure();
//		sessionFactory = config.buildSessionFactory();
//
//
//		session = sessionFactory.openSession();
//		session.beginTransaction();
//		session.save(user);
//		session.getTransaction().commit();
//		session.close();
//
//		session = sessionFactory.openSession();
//		session.beginTransaction();
//		session.save(user2);
//		session.getTransaction().commit();
//		session.close();
//
//		session = sessionFactory.openSession();
//		session.beginTransaction();
//		session.save(user3);
//		session.getTransaction().commit();
//		session.close();
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
//