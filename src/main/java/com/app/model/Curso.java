package com.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.*;

@Entity
@Data
@Table(name = "curso")
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
	
	@Id	
	@GeneratedValue
	private Integer id_curso;
	private String curso;
	private String dia;		
	private String duracion;
	private String horario;
	
	
	
	public Curso() {
	}



	public Curso(Integer id_curso, String curso, String dia, String duracion, String horario) {
		this.id_curso = id_curso;
		this.curso = curso;
		this.dia = dia;
		this.duracion = duracion;
		this.horario = horario;
	}



	public Integer getId_curso() {
		return id_curso;
	}



	public void setId_curso(Integer id_curso) {
		this.id_curso = id_curso;
	}



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}



	public String getDia() {
		return dia;
	}



	public void setDia(String dia) {
		this.dia = dia;
	}



	public String getDuracion() {
		return duracion;
	}



	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}



	public String getHorario() {
		return horario;
	}



	public void setHorario(String horario) {
		this.horario = horario;
	}


	
	
	
	
}
