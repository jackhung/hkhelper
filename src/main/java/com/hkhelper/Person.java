package com.hkhelper;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
import org.springframework.data.annotation.Id;

// @Entity
public class Person {

	@Id private String id;
	// @GeneratedValue(strategy = GenerationType.AUTO)
	// private String long;


	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}