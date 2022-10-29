package com.example.demoelarning.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;

@Entity
public class Reclamation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@NotBlank
	private String object;
	@NotBlank
	private String description;



	@ManyToMany
	@JoinTable(name = "user_reclamations",
	joinColumns = @JoinColumn(name = "reclamation_id"), 
	inverseJoinColumns = @JoinColumn(name = "user_id"))
	private Set<User> usersReclamations=new HashSet<>();



	public Reclamation() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Reclamation(Long id, @NotBlank String object, @NotBlank String description, Set<User> usersReclamations) {
		super();
		Id = id;
		this.object = object;
		this.description = description;
		this.usersReclamations = usersReclamations;
	}



	public Long getId() {
		return Id;
	}



	public void setId(Long id) {
		Id = id;
	}



	public String getObject() {
		return object;
	}



	public void setObject(String object) {
		this.object = object;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Set<User> getUsersReclamations() {
		return usersReclamations;
	}



	public void setUsersReclamations(Set<User> usersReclamations) {
		this.usersReclamations = usersReclamations;
	}
	
	

}
