package com.flujocaja.tdsc.app.service;

import java.util.Optional;

import com.flujocaja.tdsc.app.entity.Ingresos;


public interface IngresosService {

	public Iterable<Ingresos> findAll();
	
	public Optional<Ingresos> findById(Integer id);
	
	public Ingresos save(Ingresos ingresos);
	
	public void deleteById(Integer id);
}
