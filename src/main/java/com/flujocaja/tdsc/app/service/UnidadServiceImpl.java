package com.flujocaja.tdsc.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flujocaja.tdsc.app.entity.Unidad;
import com.flujocaja.tdsc.app.repository.UnidadRepository;

@Service
public class UnidadServiceImpl implements UnidadService {

	
	@Autowired
	private UnidadRepository unidadRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Unidad> findAll() {
		
		return unidadRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Unidad> findById(Integer id) {
		
		return unidadRepository.findById(id);
	}

	@Override
	@Transactional
	public Unidad save(Unidad unidad) {
		// TODO Auto-generated method stub
		return unidadRepository.save(unidad);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		unidadRepository.deleteById(id);
	}
	
	
	

}
