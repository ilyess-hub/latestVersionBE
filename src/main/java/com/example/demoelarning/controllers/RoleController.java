package com.example.demoelarning.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoelarning.models.Role;
import com.example.demoelarning.service.RoleService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/roles")
public class RoleController  {
	@Autowired
	public RoleService roleService;
	
	@GetMapping("")
	public List<Role>getAllRoles(){
		return this.roleService.getAllRoles();
	}

}
