package com.flujocaja.tdsc.app.service;

import java.util.Optional;

import org.springframework.data.domain.Sort;
import com.flujocaja.tdsc.app.entity.Egresos;


public interface EgresosService {

	public Iterable<Egresos> findAll();
	
	public Iterable<Egresos> findAll(Sort sort);
	
	public Optional<Egresos> findById(Integer id);
	
	public Egresos save(Egresos egresos);
	
	public void deleteById(Integer id);
	
}
