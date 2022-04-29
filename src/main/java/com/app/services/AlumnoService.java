package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Alumno;
import com.app.repositories.AlumnoRepo;


@Service
public class AlumnoService {

	@Autowired
	AlumnoRepo alumnoRepo;
	
	public List<Alumno> getAllAlumno() { return alumnoRepo.findAll(); }	
	
	
}
