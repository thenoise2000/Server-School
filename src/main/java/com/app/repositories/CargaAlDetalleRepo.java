package com.app.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.model.CargaAlmDetalle;
import com.app.model.CargaDetalle;

@Repository
public interface CargaAlDetalleRepo extends JpaRepository<CargaAlmDetalle, Integer> {

	@Query(value = "SELECT * FROM cargaalmdetalle INNER JOIN curso "
			+ "ON cargadetalle.id_detalle=curso.id_curso INNER JOIN alumno "
			+ "ON cargadetalle.id_detalle=alumno.id_alumno", nativeQuery = true
			 )
	
	List<CargaAlmDetalle> findAllCargaAlDetalle();
}
