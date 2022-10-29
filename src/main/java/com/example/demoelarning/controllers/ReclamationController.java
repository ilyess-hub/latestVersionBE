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

import com.example.demoelarning.models.Reclamation;
import com.example.demoelarning.service.ReclamationService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/reclamations")
public class ReclamationController {
	
	@Autowired
	ReclamationService ReclamationService;
	@GetMapping("")
	public List<Reclamation>getAllReclamation(){
		return this.ReclamationService.getAllReclamations();
	}
	@PostMapping
	public Reclamation addReclamation(@RequestBody Reclamation a) {
		return this.ReclamationService.addReclamation(a);
	}
	@GetMapping("/{id}")
	public Reclamation getById(@PathVariable Long id) {
		return this.ReclamationService.getById(id);
	}
	@PutMapping("/{id}")
	public Reclamation update(@PathVariable Long id,@RequestBody Reclamation a) {
		return this.ReclamationService.updateReclamation(a);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		this.ReclamationService.deleteReclamation(id);
		
	}

}
