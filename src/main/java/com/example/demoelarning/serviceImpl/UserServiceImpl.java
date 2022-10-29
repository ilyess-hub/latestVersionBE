package com.example.demoelarning.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoelarning.models.User;
import com.example.demoelarning.repository.UserRepo;
import com.example.demoelarning.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userRepo;

	@Override
	public User addUser(User a) {
		// TODO Auto-generated method stub
		return this.userRepo.save(a);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return this.userRepo.findAll();
	}

	@Override
	public User updateUser(User a) {
		// TODO Auto-generated method stub
		return this.userRepo.save(a);
	}

	@Override
	public User getById(Long id) {
		// TODO Auto-generated method stub
		Optional<User>u= this.userRepo.findById(id);
		return u.isPresent()?u.get():null;
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		this.userRepo.deleteById(id);
		
	}

	@Override
	public User login(String email, String password) {
		// TODO Auto-generated method stub
		return this.userRepo.findByInfo(email, password);
	}

}
