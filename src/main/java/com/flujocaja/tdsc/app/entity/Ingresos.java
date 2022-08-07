package com.flujocaja.tdsc.app.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ingresos")
public class Ingresos implements Serializable{
	
	
	private int id_ingresos;
	
	private int id_cuenta;
	
	private Date fecha;
	
	private float arrrendamiento;
	
	private float venta_de_bienes;
	
	private float tasas_y_derechos;
	
	private float ingresos_varios;
	
	private float transf_corrientes_gc;
	
	private float transf_corrientes_er;
	
	private float transf_corrientes_vigencia_anterior;
	
	private float transf_de_capital;
	
	private float aportes_de_capitral;
	
	private float venta_de_activos_t;
	
	private float transf_de_capital_periodo_anterior;
	
	private float depositos_favor_terceros;
	
	private float transf_recibidas;
	
	private float total_ingresos;

	public int getId_ingresos() {
		return id_ingresos;
	}

	public void setId_ingresos(int id_ingresos) {
		this.id_ingresos = id_ingresos;
	}

	public int getId_cuenta() {
		return id_cuenta;
	}

	public void setId_cuenta(int id_cuenta) {
		this.id_cuenta = id_cuenta;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public float getArrrendamiento() {
		return arrrendamiento;
	}

	public void setArrrendamiento(float arrrendamiento) {
		this.arrrendamiento = arrrendamiento;
	}

	public float getVenta_de_bienes() {
		return venta_de_bienes;
	}

	public void setVenta_de_bienes(float venta_de_bienes) {
		this.venta_de_bienes = venta_de_bienes;
	}

	public float getTasas_y_derechos() {
		return tasas_y_derechos;
	}

	public void setTasas_y_derechos(float tasas_y_derechos) {
		this.tasas_y_derechos = tasas_y_derechos;
	}

	public float getIngresos_varios() {
		return ingresos_varios;
	}

	public void setIngresos_varios(float ingresos_varios) {
		this.ingresos_varios = ingresos_varios;
	}

	public float getTransf_corrientes_gc() {
		return transf_corrientes_gc;
	}

	public void setTransf_corrientes_gc(float transf_corrientes_gc) {
		this.transf_corrientes_gc = transf_corrientes_gc;
	}

	public float getTransf_corrientes_er() {
		return transf_corrientes_er;
	}

	public void setTransf_corrientes_er(float transf_corrientes_er) {
		this.transf_corrientes_er = transf_corrientes_er;
	}

	public float getTransf_corrientes_vigencia_anterior() {
		return transf_corrientes_vigencia_anterior;
	}

	public void setTransf_corrientes_vigencia_anterior(float transf_corrientes_vigencia_anterior) {
		this.transf_corrientes_vigencia_anterior = transf_corrientes_vigencia_anterior;
	}

	public float getTransf_de_capital() {
		return transf_de_capital;
	}

	public void setTransf_de_capital(float transf_de_capital) {
		this.transf_de_capital = transf_de_capital;
	}

	public float getAportes_de_capitral() {
		return aportes_de_capitral;
	}

	public void setAportes_de_capitral(float aportes_de_capitral) {
		this.aportes_de_capitral = aportes_de_capitral;
	}

	public float getVenta_de_activos_t() {
		return venta_de_activos_t;
	}

	public void setVenta_de_activos_t(float venta_de_activos_t) {
		this.venta_de_activos_t = venta_de_activos_t;
	}

	public float getTransf_de_capital_periodo_anterior() {
		return transf_de_capital_periodo_anterior;
	}

	public void setTransf_de_capital_periodo_anterior(float transf_de_capital_periodo_anterior) {
		this.transf_de_capital_periodo_anterior = transf_de_capital_periodo_anterior;
	}

	public float getDepositos_favor_terceros() {
		return depositos_favor_terceros;
	}

	public void setDepositos_favor_terceros(float depositos_favor_terceros) {
		this.depositos_favor_terceros = depositos_favor_terceros;
	}

	public float getTransf_recibidas() {
		return transf_recibidas;
	}

	public void setTransf_recibidas(float transf_recibidas) {
		this.transf_recibidas = transf_recibidas;
	}

	public float getTotal_ingresos() {
		return total_ingresos;
	}

	public void setTotal_ingresos(float total_ingresos) {
		this.total_ingresos = total_ingresos;
	}
	
	
	
	
	

}
