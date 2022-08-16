package com.flujocaja.tdsc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flujocaja.tdsc.app.entity.Cuentas;

@Repository
public interface CuentasRepository extends JpaRepository<Cuentas, Integer> {

}
