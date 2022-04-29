package com.app.dto;

import lombok.Data;

@Data
public class CargaAlDetalleDTO {

	private Integer id_detalle;
	private Integer id_curso;
	private Integer id_alumno;
	private String detalle;
	
	public CargaAlDetalleDTO() {
	}

	public CargaAlDetalleDTO(Integer id_detalle, Integer id_curso, Integer id_alumno, String detalle) {
		this.id_detalle = id_detalle;
		this.id_curso = id_curso;
		this.id_alumno = id_alumno;
		this.detalle = detalle;
	}

	public Integer getId_detalle() {
		return id_detalle;
	}

	public void setId_detalle(Integer id_detalle) {
		this.id_detalle = id_detalle;
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
