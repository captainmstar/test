package com.rick.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Test {

	@Id
	@GeneratedValue
	private Long id;
	
	@NotEmpty(message = "Name cannot be empty")
	private String name;
	
	private String email;
	
	public Test() {}

	public Test(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "Test [name=" + name + ", email=" + email + "]";
	}
	
	
}
