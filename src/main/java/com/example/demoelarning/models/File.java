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
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
@Entity
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
    @NotBlank
	private String name;
    @NotBlank
	private String description;
    @NotNull
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Date dateOfCreation;
    
    @ManyToMany
	@JoinTable(name = "users_files",
	joinColumns = @JoinColumn(name = "file_id"), 
	inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> users=new HashSet<>();

	public File() {
		super();
		// TODO Auto-generated constructor stub
	}

	public File(Long id, @NotBlank String name, @NotBlank String description, Date dateOfCreation, Set<User> users) {
		super();
		Id = id;
		this.name = name;
		this.description = description;
		this.dateOfCreation = dateOfCreation;
		this.users = users;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
    
    

}
