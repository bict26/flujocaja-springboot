package com.flujocaja.tdsc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flujocaja.tdsc.app.entity.Colaborador;
import com.flujocaja.tdsc.app.entity.Egresos;
import com.flujocaja.tdsc.app.service.CuentaService;

@Repository
public interface ColaboradorRepository extends JpaRepository<Colaborador, Integer> {
	
	
	
}
