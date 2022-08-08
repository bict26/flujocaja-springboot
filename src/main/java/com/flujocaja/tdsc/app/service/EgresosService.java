package com.flujocaja.tdsc.app.service;

import java.util.Optional;

import com.flujocaja.tdsc.app.entity.Egresos;


public interface EgresosService {

	public Iterable<Egresos> findAll();
	
	public Optional<Egresos> findById(Integer id);
	
	public Egresos save(Egresos egresos);
	
	public void deleteById(Integer id);
	
}
