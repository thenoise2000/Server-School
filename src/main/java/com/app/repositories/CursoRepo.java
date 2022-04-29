package com.app.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Curso;

@Repository
public interface CursoRepo extends JpaRepository<Curso, Integer> {

	
}
