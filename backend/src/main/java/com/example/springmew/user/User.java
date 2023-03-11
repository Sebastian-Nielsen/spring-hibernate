package com.example.springmew.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

@Entity
@Getter
@Setter
@Table(name = "user_table")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
//	@NaturalId(mutable = true)
	private String email;
	private String password;
	private String role;

	public String toString() {
		return "User(id: " + id + ", firstName: '" + firstName + "', email: '" + email + "')";
	}
}
