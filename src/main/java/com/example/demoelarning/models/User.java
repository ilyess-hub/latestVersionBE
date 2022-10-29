package com.example.demoelarning.models;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@NotBlank
	@Size(min = 5, max = 10)
	private String firstName;
	@NotBlank
	@Size(min = 5, max = 10)
	private String lastName;
	@NotBlank
	private String gender;
	@NotNull
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Date birthday;
	@NotBlank
	@Size(min = 8, max = 20)
	private String phoneNumber;
	@NotBlank
	private String country;
	@NotBlank
	@Email
	private String email;
	@NotBlank(message = "New password is mandatory")
	@Size(min = 8, max = 16)
	private String password;
	@ManyToMany
	@JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(Long id, @NotBlank @Size(min = 5, max = 10) String firstName,
			@NotBlank @Size(min = 5, max = 10) String lastName, @NotBlank String gender, Date birthday,
			@NotBlank @Size(min = 8, max = 20) String phoneNumber, @NotBlank String country,
			@NotBlank @Email String email,
			@NotBlank(message = "New password is mandatory") @Size(min = 8, max = 16) String password,
			Set<Role> roles) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthday = birthday;
		this.phoneNumber = phoneNumber;
		this.country = country;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}

	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}
