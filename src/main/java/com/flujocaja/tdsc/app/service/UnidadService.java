package com.flujocaja.tdsc.app.service;

import java.util.Optional;

import com.flujocaja.tdsc.app.entity.Unidad;

public interface UnidadService {

	public Iterable<Unidad> findAll();
	
	public Optional<Unidad> findById(Integer id);
	
	public Unidad save(Unidad unidad);
	
	public void deleteById(Integer id);
	
}
