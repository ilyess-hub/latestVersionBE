package com.example.demoelarning.service;

import java.util.List;

import com.example.demoelarning.models.User;

public interface UserService {
	public User addUser(User a);
	public List<User>  getAllUsers();
	public User updateUser(User a);
	public User getById(Long id);
	public void deleteUser(Long id);
	public User login(String email,String password);

}
