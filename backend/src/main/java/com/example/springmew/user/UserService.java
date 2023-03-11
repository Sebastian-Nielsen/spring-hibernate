package com.example.springmew.user;


import lombok.RequiredArgsConstructor;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;
//	private PasswordEncoder passwordEncoder;

	public static void delete(Long bookId) {
		System.out.println("UserService.delete(" + bookId + ")");
	}

//	public User add(User user) throws UserAlreadyExistsException {
	public void add(User user) {
//		Optional<User> theUser = userRepository.findById(user.getEmail());
//		if (theUser.isPresent()) {
//			throw new UserAlreadyExistsException("A user with " + user.getEmail() + " already exists");
//		}
//		user.setPassword(passwordEncoder.encode(user.getPassword()));

//		user.setPassword(pass)
//		return userRepository.save(user);
	}

}