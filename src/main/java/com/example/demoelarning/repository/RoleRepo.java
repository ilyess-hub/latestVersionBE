package com.example.demoelarning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoelarning.models.Role;
@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {

}
