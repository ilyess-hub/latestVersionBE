package com.example.demoelarning.controllers;

import java.util.List;

import javax.validation.Valid;

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

import com.example.demoelarning.models.Traineeship;
import com.example.demoelarning.service.TraineeshipService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/traineeships")
public class TraineeshipController {
@Autowired
TraineeshipService traineeshipService;
@GetMapping("")
public List<Traineeship>getAllTraineeship(){
	return this.traineeshipService.getAllTraineeships();
}
@PostMapping
public Traineeship addTraineeship(@Valid@RequestBody Traineeship a) {
	return this.traineeshipService.addTraineeship(a);
}
@GetMapping("/{id}")
public Traineeship getById(@PathVariable Long id) {
	return this.traineeshipService.getById(id);
}
@PutMapping("/{id}")
public Traineeship update(@PathVariable Long id,@RequestBody Traineeship a) {
	return this.traineeshipService.updateTraineeship(a);
}

@DeleteMapping("/{id}")
public void delete(@PathVariable Long id) {
	this.traineeshipService.deleteTraineeship(id);
}
@PutMapping("/abon/{id}")
public Traineeship abonner(@RequestBody Traineeship c,@PathVariable Long id) {
	return this.traineeshipService.abonner(c, id);
	
	
}

}
