package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "instructor")
public class Instructor {
	
	@Id	
	private Integer id_instructor;
	private String nombre;
	private String apellido;	
	
	private String genero;
	
	public Instructor() {		
	}

	public Instructor(Integer id_instructor, String nombre, String apellido, String genero) {
		this.id_instructor = id_instructor;
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
	}

	public Integer getId_instructor() {
		return id_instructor;
	}

	public void setId_instructor(Integer id_instructor) {
		this.id_instructor = id_instructor;
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	
	
		
	

}
