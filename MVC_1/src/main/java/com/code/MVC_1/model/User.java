package com.code.MVC_1.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {
	@NotBlank
	@Size(min = 1, max = 100)
	private String name;
	@NotBlank
	@Email
	@Size(min = 4, max = 25)
	private String email;
	@NotBlank
	@Size(min = 2, max = 32)
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
