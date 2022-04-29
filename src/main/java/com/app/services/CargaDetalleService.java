package com.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.CargaDetalle;
import com.app.repositories.CargaDetalleRepo;


@Service
public class CargaDetalleService {
	
	@Autowired
	CargaDetalleRepo cadRepo;
	
	public List<CargaDetalle> getAllCargaDetalle() {
		return cadRepo.findAll();
	}
	
	public void addCargaDetalle(CargaDetalle cargaDetalle) {
		 cadRepo.save(cargaDetalle);	}	
	
	

}
