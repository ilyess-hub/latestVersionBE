package com.example.demoelarning.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoelarning.models.LoginRequest;
import com.example.demoelarning.models.User;
import com.example.demoelarning.service.UserService;


@CrossOrigin("*")
@RestController
@RequestMapping("api/users")
public class UserController {
	@Autowired
	UserService userService;
	@GetMapping("")
	public List<User>getAllUser(){
		return this.userService.getAllUsers();
	}
	@PostMapping
	public User addUser(@RequestBody User a) {
		return this.userService.addUser(a);
	}
	@GetMapping("/{id}")
	public User getById(@PathVariable Long id) {
		return this.userService.getById(id);
	}
	@PutMapping("/{id}")
	public User update(@PathVariable Long id,@RequestBody User a) {
		return this.userService.updateUser(a);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		this.userService.deleteUser(id);
		
	}
	@PostMapping("/login")
	public User login(@RequestBody LoginRequest user) {
		return this.userService.login(user.getEmail(), user.getPassword());
	}

}
