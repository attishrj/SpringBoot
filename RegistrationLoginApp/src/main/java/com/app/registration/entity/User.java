package com.app.registration.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class User {
	@Id
	@NotNull
	String emailid;
	@NotNull
	String firstname;
	@NotNull
	String lastname;
	@NotNull
	String gender;
	@NotNull
	int age;
	@NotNull
	private String password;

	@NotNull
	long phoneNumber;

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "RegistrationEntity [emailid=" + emailid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", gender=" + gender + ", age=" + age + ", password=" + password + ", phoneNumber=" + phoneNumber
				+ "]";
	}

}
