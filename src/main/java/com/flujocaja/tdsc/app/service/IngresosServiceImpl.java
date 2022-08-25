package com.flujocaja.tdsc.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flujocaja.tdsc.app.entity.Ingresos;
import com.flujocaja.tdsc.app.repository.IngresosRepository;

@Service
public class IngresosServiceImpl implements IngresosService{

	@Autowired
	private IngresosRepository ingresosRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Ingresos> findAll() {
	
		return ingresosRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Ingresos> findById(Integer id) {
		
		return ingresosRepository.findById(id);
	}

	@Override
	@Transactional
	public Ingresos save(Ingresos ingresos) {
	
		return ingresosRepository.save(ingresos);
	}
	
	@Override
	public void update(Ingresos ingresos, int id) {
		
		Optional<Ingresos> ingreso = this.ingresosRepository.findById(id);
		
		
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
	
		ingresosRepository.deleteById(id);
		
	}



}
