package com.app.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data

public class CargaAlmDetalle {
	
	@Id	
	private Integer id_detalle_al;	
	
	
	private Integer id_curso;
	
	
	private Integer id_alumno;
	
	private String detalle;

	public CargaAlmDetalle() {
	}

	public CargaAlmDetalle(Integer id_detalle_al, Integer id_curso, Integer id_alumno, String detalle) {
		this.id_detalle_al = id_detalle_al;
		this.id_curso = id_curso;
		this.id_alumno = id_alumno;
		this.detalle = detalle;
	}

	public Integer getId_detalle_al() {
		return id_detalle_al;
	}

	public void setId_detalle_al(Integer id_detalle_al) {
		this.id_detalle_al = id_detalle_al;
	}

	public Integer getId_curso() {
		return id_curso;
	}

	public void setId_curso(Integer id_curso) {
		this.id_curso = id_curso;
	}

	public Integer getId_alumno() {
		return id_alumno;
	}

	public void setId_alumno(Integer id_alumno) {
		this.id_alumno = id_alumno;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

		

}
