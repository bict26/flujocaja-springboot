package com.flujocaja.tdsc.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.flujocaja.tdsc.app.entity.Cuentas;
import com.flujocaja.tdsc.app.entity.Egresos;
import com.flujocaja.tdsc.app.entity.Ingresos;

@Service
public interface CuentaService {

	@Query(value = "SELECT * FROM Cuentas WHERE id_unidad = ?1", nativeQuery = true)
	List<Cuentas> findAllByIdUnidad(int id_unidad);
	
	public Optional<Cuentas> findById(int id);
}
