package com.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Instructor;
import com.app.repositories.InstructorRepo;


@Service
public class InstructorService {

	@Autowired
	InstructorRepo instructorRepo;
	
	public List<Instructor> getAllInstructor() { return instructorRepo.findAll(); }
	
	public void addInstructor(Instructor instructor) { instructorRepo.save(instructor);	}
	
	public void removeInstructorById(Integer id_instructor) {instructorRepo.deleteById(id_instructor); }
	
	public Optional<Instructor> getInstructorById(Integer id_instructor) {return instructorRepo.findById(id_instructor);	}	
	
}
