package com.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Curso;
import com.app.repositories.CursoRepo;


@Service
public class CursoService {
	
	@Autowired
	CursoRepo cursoRepo;
	
	public List<Curso> getAllCurso() {
		return cursoRepo.findAll();
	}
	
	public void addCurso(Curso curso) {
		cursoRepo.save(curso);
	}
	
	public void removeCursoById(Integer id_curso) {
		cursoRepo.deleteById(id_curso);
	}
	
	public Optional<Curso> getCursoById(Integer id_curso) { return cursoRepo.findById(id_curso); }

}
