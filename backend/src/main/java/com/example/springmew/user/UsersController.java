package com.example.springmew.Controller;

import com.example.springmew.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/users")
public class UsersController {

	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id") Long userId) {
		UserService.delete(userId);
		return "it's working";
	}

	// GET localhost:8080/users
	@GetMapping
	public Map<String, Object> get() {
//		doHibernateStuff();

		Map map = new HashMap<>();
		map.put("key1", "workin!!!!!!!!");
		return map;
	}

	@PostMapping
	public Map<String, Object> post(@RequestBody User o) {
		Configuration config = new Configuration().configure();

		// Create Hibernate session factory object
		SessionFactory sessionFactory = config.buildSessionFactory();

		Session session = sessionFactory.openSession();

		User user = new User();
		user.setName("John");
		user.setEmail("john@mail");
		user.setId(1);
		User user2 = new User();
		user2.setName("sebastian");
		user2.setEmail("sebastian@mail");
		user2.setId(2);

		session.beginTransaction();
		session.save(user);
		session.save(user2);
		session.getTransaction().commit();

		session.close();

		System.out.println("post");
		System.out.println("post");
		System.out.println("post");
		System.out.println("post");
		System.out.println("post");
		System.out.println(o);
		System.out.println(o.getId());
		System.out.println(o.getName());
		System.out.println(o.getEmail());
		System.out.println(o);
		System.out.println(o);
		System.out.println("post");
		System.out.println("post");

		Map map = new HashMap<>();
		return map;

	}

	private void doHibernateStuff() {
		Configuration config = new Configuration().configure();

		// Create Hibernate session factory object
		SessionFactory sessionFactory = config.buildSessionFactory();

		Session session = sessionFactory.openSession();

		User user = new User();
		user.setName("John");
		user.setId(1);
		User user2 = new User();
		user2.setName("sebastian");
		user2.setId(2);

		session.beginTransaction();
//		session.save(user);
//		session.save(user2);
		session.getTransaction().commit();

		session.close();
	}
}