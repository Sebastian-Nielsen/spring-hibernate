package com.example.springmew.user;

import org.hibernate.cfg.Configuration;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/users")
public class UsersController {

//
//	@DeleteMapping("/{id}")
//	public String delete(@PathVariable("id") Long userId) {
//		UserService.delete(userId);
//		return "it's working";
//	}
//
	UserRepository userRepository = new UserRepository();


	@GetMapping   // GET localhost:8080/users:id
	public List<User> get(@RequestParam(required = false) Long id) {
		if (id != null) {
			return List.of(userRepository.findById(id));
		} {
			return userRepository.findAll();
		}
	}

	@PostMapping
	public Map<String, Object> post(@RequestBody IdModel id) {
		User user;
		if (id.id() == null) {
			user = new User();
			user.setFirstName("no-id");
			user.setId(id.id());
			user.setEmail("no-id@mail");
		} else {
			System.out.println("requestBody: " + id);
			System.out.println("requestBody: " + id);
			System.out.println("requestBody: " + id);
			System.out.println("something: " + id.something());
			System.out.println("id: " + id.id());
			user = new User();
			user.setFirstName(id.id().toString());
			user.setEmail("john" + id.id() + "@gmail.com");
			user.setId(id.id());
		}

		userRepository.save(user);


		Map map = new HashMap<>();
		map.put("working", "working");
		return map;
	}
}