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

import com.example.demoelarning.models.File;
import com.example.demoelarning.service.FileService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/files")
public class FileController {
	@Autowired
	FileService FileService;
	@GetMapping("")
	public List<File>getAllFile(){
		return this.FileService.getAllFiles();
	}
	@PostMapping
	public File addFile(@RequestBody File a) {
		return this.FileService.addFile(a);
	}
	@GetMapping("/{id}")
	public File getById(@PathVariable Long id) {
		return this.FileService.getById(id);
	}
	@PutMapping("/{id}")
	public File update(@PathVariable Long id,@RequestBody File a) {
		return this.FileService.updateFile(a);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		this.FileService.deleteFile(id);
		
	}

}
