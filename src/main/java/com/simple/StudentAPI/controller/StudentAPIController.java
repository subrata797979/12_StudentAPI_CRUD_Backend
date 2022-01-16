package com.simple.StudentAPI.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.simple.StudentAPI.entity.StudentAPI;
import com.simple.StudentAPI.service.StudentAPIService;


@CrossOrigin
@RestController
public class StudentAPIController {
	
	@Autowired
	private StudentAPIService studentService;
	
	
	// GET Mapping
	@GetMapping("/") 
	public String home() {
		return "GET / 'home page!'";
	}
	
	@GetMapping("/students") 
	public List<StudentAPI> all() {
		return this.studentService.getAll();
	}
	
	@GetMapping("/student/{id}")
	public StudentAPI getById(@PathVariable final Long id ) {
		return this.studentService.get(id);
	}
	
	// POST Mapping
	@PostMapping("/student/store")
	public String store(@RequestBody StudentAPI s) {
		studentService.store(s);
		return "Student Record Stored Successfully!";	// how to redirect to previous page after successful post or delete?
	}
	
	// PUT Mapping
	
	// DELETE Mapping
	@DeleteMapping("/student/delete/{id}")
	public String deleteById(@PathVariable final Long id ) {
		studentService.delete(id);
		return "redirect:/students";
	}
	
}
