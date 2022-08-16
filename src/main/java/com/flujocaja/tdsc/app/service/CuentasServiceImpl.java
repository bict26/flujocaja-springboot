package com.flujocaja.tdsc.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.flujocaja.tdsc.app.entity.Cuentas;
import com.flujocaja.tdsc.app.repository.CuentasRepository;
import com.flujocaja.tdsc.app.repository.EgresosRepository;

public class CuentasServiceImpl implements CuentaService{

	
	@Autowired
	private CuentasRepository cuentasRepository;

	@Override
	public List<Cuentas> findAllByIdUnidad(int id_unidad) {
		// TODO Auto-generated method stub
		return cuentasRepository.findAllByIdUnidad(id_unidad);
	}

	@Override
	public Optional<Cuentas> findById(int id) {
		// TODO Auto-generated method stub
		return cuentasRepository.findById(id);
	}

	
	
}
