package com.example.springmew.Controller;

import com.example.springmew.User;
import com.example.springmew.model.LiveStream;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/streams")
public class LiveStreamController {

	private List<LiveStream> streams = new ArrayList<>();


	// GET localhost:8080/streams
	@GetMapping
	public Map<String, Object> findAll() {
		f();

		Map map = new HashMap<>();
		map.put("key1", "workin!!!!!!!!");
		return map;
	}


	private void f() {
		// Create Hibernate configuration object
		Configuration config = new Configuration().configure();

		// Create Hibernate session factory object
		SessionFactory sessionFactory = config.buildSessionFactory();

		// Create Hibernate session object
		Session session = sessionFactory.openSession();

		User user = new User();
		user.setName("John");
		User user2 = new User();
		user.setName("sebastian");

		session.beginTransaction();
		session.save(user);
		session.save(user2);
		session.getTransaction().commit();
//
//		 Close the Hibernate session
		session.close();
	}
}