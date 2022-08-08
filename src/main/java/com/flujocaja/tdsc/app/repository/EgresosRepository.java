package com.flujocaja.tdsc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flujocaja.tdsc.app.entity.Egresos;

@Repository
public interface EgresosRepository extends JpaRepository<Egresos, Integer> {

}