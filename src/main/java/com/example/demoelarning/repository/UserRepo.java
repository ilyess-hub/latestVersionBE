package com.example.demoelarning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demoelarning.models.User;
@Repository
public interface UserRepo extends JpaRepository<User, Long> {
	@Query("SELECT u FROM User u WHERE u.email= :email AND u.password= :password ")
	public User findByInfo(@Param(value = "email") String email,@Param(value = "password") String password);


}
