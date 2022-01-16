package com.simple.StudentAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.simple.StudentAPI.entity.StudentAPI;
 

@Repository
public interface StudentAPIRepository extends JpaRepository<StudentAPI, Long> {
	
}
