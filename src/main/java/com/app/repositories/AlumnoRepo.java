package com.app.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Alumno;

@Repository
public interface AlumnoRepo extends JpaRepository<Alumno, Integer> {
	
}