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
	private int id_cuentas; //fix
	
	@Column(nullable=false)
	private String n_cuenta;
	
	@Column(nullable=false)
	private int	id_unidad;

	public int getId_cuentas() {
		return id_cuentas;
	}

	public void setId_cuentas(int id_cuentas) {
		this.id_cuentas = id_cuentas;
	}

	public String getN_cuenta() {
		return n_cuenta;
	}

	public void setN_cuenta(String n_cuenta) {
		this.n_cuenta = n_cuenta;
	}

	public int getId_unidad() {
		return id_unidad;
	}

	public void setId_unidad(int id_unidad) {
		this.id_unidad = id_unidad;
	}

	
	
}
