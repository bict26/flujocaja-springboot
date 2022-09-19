package com.flujocaja.tdsc.app.repository;

import org.springframework.stereotype.Repository;

import com.flujocaja.tdsc.app.entity.Saldo_inicial;
import com.flujocaja.tdsc.app.service.SaldoInicialService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface SaldoInicialRepository extends JpaRepository<Saldo_inicial, Integer>{

	@Query(value = "SELECT * FROM saldo_inicial WHERE id_cuenta = ?1 AND fecha LIKE ?2%", nativeQuery = true)
	public Saldo_inicial findByAccountId(int id_cuenta, String fecha);

	@Query(value = "SELECT * FROM saldo_inicial WHERE id_cuenta = ?1 order by id_saldoinicial DESC LIMIT 1 ", nativeQuery = true)
	public Saldo_inicial findLastByAccount(int id_cuenta);
}
