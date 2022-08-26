package com.flujocaja.tdsc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flujocaja.tdsc.app.entity.Ingresos;

@Repository
public interface IngresosRepository extends JpaRepository<Ingresos, Integer>{

	@Query(value = "SELECT * FROM ingresos WHERE id_cuenta = ?1 AND YEAR(fecha) = ?2 ORDER BY fecha ASC", nativeQuery = true)
	public Iterable<Ingresos> findIngresosByDate(int id_cuenta, String fecha);
	
}
