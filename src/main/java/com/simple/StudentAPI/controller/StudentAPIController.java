package com.simple.StudentAPI.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	@PostMapping("/student/add")
	public String store(@RequestBody StudentAPI s) {
		studentService.store(s);
		return "Student Record Added Successfully!";	// how to redirect to previous page after successful post or delete?
	}
	
	// PUT Mapping
	@PutMapping("/student/modify/{id}")
	public String updateStudent(@RequestBody StudentAPI s, @PathVariable long id) {

		Optional<StudentAPI> studentOptional = Optional.ofNullable(this.studentService.get(id));

		if (!studentOptional.isPresent())
			return "Student not found!";

		s.setId(id);
		studentService.store(s);

		return "Student Record Modified Successfully!";
	}
	
	// DELETE Mapping
	@DeleteMapping("/student/delete/{id}")
	public String deleteById(@PathVariable final Long id ) {
		studentService.delete(id);
		return "redirect:/students";
	}
	
}
