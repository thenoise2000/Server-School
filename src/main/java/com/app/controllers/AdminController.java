package com.app.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Alumno;
import com.app.model.CargaAlmDetalle;
import com.app.model.CargaDetalle;
import com.app.model.Curso;
import com.app.model.Instructor;
import com.app.repositories.AlumnoRepo;
import com.app.repositories.CargaAlDetalleRepo;
import com.app.repositories.CargaDetalleRepo;
import com.app.repositories.CursoRepo;
import com.app.repositories.InstructorRepo;



@RestController
@RequestMapping("/api/v1")
public class AdminController {

	public static String uploadDir = System.getProperty("user.dir") + "/src/main/resources/static/userImages";
	
	@Autowired
	CursoRepo cRepo;
	
	@Autowired
	InstructorRepo iRepo;
	
	@Autowired
	AlumnoRepo aRepo;
	
	@Autowired
	CargaDetalleRepo cdRepo;
	
	@Autowired
	CargaAlDetalleRepo cadRepo;
	
		
	@GetMapping("/alumnos")
	public List<Alumno> getAllAlumnos() {
		return aRepo.findAll();
	}		
	
	
	// instructor section
	
	@GetMapping("/instructor")
	public List<Instructor> getAllInstructor() {
		return iRepo.findAll();
		
		
	}
	
	@GetMapping("/instructor/{id}")
	public Instructor getInstructorById(@PathVariable Integer id) {
		return iRepo.findById(id).get();
	}
	
	@PostMapping("/instructor")
	public Instructor saveInstructorDetails(@RequestBody Instructor instructor) {
		return iRepo.save(instructor);
	}
	
	@PutMapping("/instructor/{id}")
	public Instructor updateInstructor(@RequestBody Instructor instructor) {
		return iRepo.save(instructor);
	}
	
	@DeleteMapping("/instructor/{id}")
	public ResponseEntity<HttpStatus> deleteInstructorById(@PathVariable Integer id){
		iRepo.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	// seccion curso
	
	@GetMapping("/cursos")
	public List<Curso> getAllCursos() {
		return cRepo.findAll();
	}
	
	@PostMapping("/cursos")
	public Curso saveCursoDetails(@RequestBody Curso curso) {
		return cRepo.save(curso);
	}
	
	// seccion carga detalle
	
	@GetMapping("/cargadetalle")
	public List<CargaDetalle> getAllCdetalle() {		
		return cdRepo.findAll();
	}
	
	@GetMapping("/cargadetalle/info")
	public List<CargaDetalle> getAllCdetalleInfo() {		
		return cdRepo.findAllCargaDetalle();
	}
	
	@PostMapping("/cargadetalle")
	public CargaDetalle saveCargaDetails(@RequestBody CargaDetalle cargaDetalle) {
		return cdRepo.save(cargaDetalle);
	}
	
	// seccion carga alumno detalle
	
	@GetMapping("/cargaaldetalle")
	public List<CargaAlmDetalle> getAllCaldetalle() {
		return cadRepo.findAll();
	}
	
	@GetMapping("/cargaaldetalle/info")
	public List<CargaAlmDetalle> getAllCaldetalleInfo() {
		return cadRepo.findAllCargaAlDetalle();
	}
	
	@PostMapping("/cargaaldetalle")
	public CargaAlmDetalle saveCargaAlDetails(@RequestBody CargaAlmDetalle cargaAlDetalle) {
		return cadRepo.save(cargaAlDetalle);
	}
	
	
	
}
