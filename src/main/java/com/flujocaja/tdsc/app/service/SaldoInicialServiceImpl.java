package com.flujocaja.tdsc.app.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import com.flujocaja.tdsc.app.entity.Saldo_inicial;
import com.flujocaja.tdsc.app.repository.SaldoInicialRepository;

@Service
public class SaldoInicialServiceImpl implements SaldoInicialService{
	
	@Autowired
	private SaldoInicialRepository saldoinicialRepository;


	@Override
	public Optional<Saldo_inicial> findById(Integer id) {
		// TODO Auto-generated method stub
		return saldoinicialRepository.findById(id);
	}

	@Override
	public Saldo_inicial save(Saldo_inicial saldo_inicial) {
		// TODO Auto-generated method stub
		return saldoinicialRepository.save(saldo_inicial);
	}
	
}
