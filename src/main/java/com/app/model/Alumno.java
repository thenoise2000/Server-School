package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "alumno")
public class Alumno {
	
	@Id	
	private Integer id_alumno;
	
	private String nombre;
	private String apellido;
	
	public Alumno() {		
	}

	public Alumno(Integer id_alumno, String nombre, String apellido) {
		this.id_alumno = id_alumno;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Integer getId_alumno() {
		return id_alumno;
	}

	public void setId_alumno(Integer id_alumno) {
		this.id_alumno = id_alumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	
	
	

}
