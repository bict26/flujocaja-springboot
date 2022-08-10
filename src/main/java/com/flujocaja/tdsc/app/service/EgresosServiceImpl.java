package com.flujocaja.tdsc.app.service;

import java.util.Optional;
import org.springframework.data.domain.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flujocaja.tdsc.app.entity.Egresos;
import com.flujocaja.tdsc.app.repository.EgresosRepository;

@Service
public class EgresosServiceImpl implements EgresosService{

	@Autowired
	private EgresosRepository egresosRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Egresos> findAll() {
		
		return egresosRepository.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Egresos> findAll(Sort sort) {
		
		return egresosRepository.findAll(sort);
	}

	

	@Override
	@Transactional(readOnly = true)
	public Optional<Egresos> findById(Integer id) {
		
		return egresosRepository.findById(id);
	}

	@Override
	@Transactional
	public Egresos save(Egresos egresos) {
		
		return egresosRepository.save(egresos);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		
		egresosRepository.deleteById(id);
		
	}

	

}
