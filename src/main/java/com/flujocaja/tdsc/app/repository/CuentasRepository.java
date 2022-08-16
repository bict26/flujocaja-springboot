package com.flujocaja.tdsc.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flujocaja.tdsc.app.entity.Cuentas;
import com.flujocaja.tdsc.app.service.CuentaService;

@Repository
public interface CuentasRepository extends JpaRepository<Cuentas, Integer>, CuentaService{
	
	
}
