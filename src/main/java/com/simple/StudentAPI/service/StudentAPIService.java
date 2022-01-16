package com.simple.StudentAPI.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.simple.StudentAPI.entity.StudentAPI;
import com.simple.StudentAPI.repository.StudentAPIRepository;

@Service
public class StudentAPIService {
	
	// Log for Service Layer
	Logger logger = LoggerFactory.getLogger(StudentAPIService.class);
	
	@Autowired
	private StudentAPIRepository srepo;
	
	// Create & Update (POST vs PUT)
	public void store(StudentAPI s) {
	    srepo.save(s);
	}
	
	// Read (GET)
	public StudentAPI get(long id) {
	    return srepo.findById(id).get();
	}
	
	public List<StudentAPI> getAll() {
		logger.info("StudentAPIService : Getting data of all Students!");
		return srepo.findAll();
	}
	
	// Delete (DELETE)
	public void delete(long id) {
	    srepo.deleteById(id);
	}
	
}
