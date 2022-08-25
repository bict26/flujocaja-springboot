package com.flujocaja.tdsc.app.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Saldo_inicial")
public class Saldo_inicial implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_saldoinicial;
	
	@Column(nullable=false)
	private int id_cuenta;
	
	@Column(nullable=false)
	private float saldo_inicial;
	
	@Column(nullable= false)
	private Date fecha;
	
	
	//-------get and set-------------------
	
	

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getId_saldoinicial() {
		return id_saldoinicial;
	}

	public void setId_saldoinicial(int id_saldoinicial) {
		this.id_saldoinicial = id_saldoinicial;
	}

	public int getId_cuenta() {
		return id_cuenta;
	}

	public void setId_cuenta(int id_cuenta) {
		this.id_cuenta = id_cuenta;
	}

	public float getSaldo_inicial() {
		return saldo_inicial;
	}

	public void setSaldo_inicial(float saldo_inicial) {
		this.saldo_inicial = saldo_inicial;
	}

	
	
	
	
}
