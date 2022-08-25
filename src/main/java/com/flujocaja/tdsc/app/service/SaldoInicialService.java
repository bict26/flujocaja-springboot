package com.flujocaja.tdsc.app.service;

import com.flujocaja.tdsc.app.entity.Saldo_inicial;

import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public interface SaldoInicialService {
	
	//public Iterable<Saldo_inicial> findAll();
	
	//public Iterable<Saldo_inicial> findAll(Sort sort);
	
	public Optional<Saldo_inicial> findById(Integer id);
	
	public Saldo_inicial save(Saldo_inicial saldo_inicial);
	
	//public void deleteById(Integer id);
	
}
