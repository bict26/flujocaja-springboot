package com.flujocaja.tdsc.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cuentas")
public class Cuentas implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cuentas;
	
	@Column(nullable=false)
	private String n_cuenta;
	
	@Column(nullable=false)
	private int	id_unidad;

}
