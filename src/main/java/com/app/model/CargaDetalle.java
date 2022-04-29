package com.app.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "cargadetalle")
@AllArgsConstructor
@NoArgsConstructor
public class CargaDetalle {
	
		
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_detalle;	
	
	private Integer id_curso;	
	
	private Integer id_instructor;
	
	private String detalle;

	public CargaDetalle() {
		
	}

	public CargaDetalle(Integer id_detalle, Integer id_curso, Integer id_instructor, String detalle) {
		this.id_detalle = id_detalle;
		this.id_curso = id_curso;
		this.id_instructor = id_instructor;
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

	public Integer getId_instructor() {
		return id_instructor;
	}

	public void setId_instructor(Integer id_instructor) {
		this.id_instructor = id_instructor;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	

	
		
	

}
