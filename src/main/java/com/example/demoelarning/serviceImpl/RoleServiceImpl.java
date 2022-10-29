package com.example.demoelarning.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoelarning.models.Role;
import com.example.demoelarning.repository.RoleRepo;
import com.example.demoelarning.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	
	@Autowired
	public RoleRepo roleRepo;
	
	@Override
	public List<Role> getAllRoles() {
		// TODO Auto-generated method stub
		return this.roleRepo.findAll()
;	}

}
