package com.flujocaja.tdsc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flujocaja.tdsc.app.entity.Egresos;

@Repository
public interface EgresosRepository extends JpaRepository<Egresos, Integer> {

	@Query(value = "SELECT * FROM egresos WHERE id_cuenta = ?1 AND YEAR(fecha) = ?2 ORDER BY fecha ASC", nativeQuery = true)
	public Iterable<Egresos> findEgresosByDate(int id_cuenta, String fecha);
	
}
