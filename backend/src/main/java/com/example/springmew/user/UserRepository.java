package com.example.springmew.user;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.stereotype.Repository;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
//
//		// Create Hibernate session factory object


	Configuration config = new Configuration().configure();
	SessionFactory sessionFactory = config.buildSessionFactory();

	public void save(User user) {

		Session session = sessionFactory.openSession();

		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();

		session.close();

	}
	public void delete(Object o) {

	}

//	@PersistenceContext
//	EntityManager entityManager;

	public List<User> findAll() {
		Session session = sessionFactory.openSession();
		List<User> users = session.createQuery("FROM User", User.class).list();
		session.close();
		return users;
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//		CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);
//		Root<User> root = criteriaQuery.from(User.class);
//		criteriaQuery.select(root);
//		TypedQuery<User> query = entityManager.createQuery(criteriaQuery);
//		return query.getResultList();
	}

	public User findById(Long id) {
		Session session = sessionFactory.openSession();
		User user = session.get(User.class, id);
		session.close();
		return user;
	}

}