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
@Table(name = "Ingresos")
public class Ingresos implements Serializable{
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_ingreso;
	
	/*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dni_id", referencedColumnName = "number") */
	private int id_cuenta;
	
	@Column(nullable=false)
	private Date fecha;
	
	@Column(nullable=true)
	private float arrrendamiento;
	
	@Column(nullable=true)
	private float venta_de_bienes;
	
	@Column(nullable=true)
	private float venta_de_servicios;
	
	@Column(nullable=true)
	private float tasas_y_derechos;
	
	@Column(nullable=true)
	private float ingresos_varios;
	
	@Column(nullable=true)
	private float transf_corrientes_gc;
	
	@Column(nullable=true)
	private float transf_corrientes_er;
	
	@Column(nullable=true)
	private float transf_corrientes_vigencia_anterior;
	
	@Column(nullable=true)
	private float transf_de_capital;
	
	@Column(nullable=true)
	private float aportes_de_capitral;
	
	@Column(nullable=true)
	private float recuperacion_de_prestamos;
	
	@Column(nullable=true)
	private float venta_de_activos_t;
	
	@Column(nullable=true)
	private float transf_de_capital_periodo_anterior;
	
	@Column(nullable=true)
	private float depositos_favor_terceros;
	
	@Column(nullable=true)
	private float transf_recibidas;
	
	@Column(nullable=true)
	private float total_ingresos;


	public float getVenta_de_servicios() {
		return venta_de_servicios;
	}

	public void setVenta_de_servicios(float venta_de_servicios) {
		this.venta_de_servicios = venta_de_servicios;
	}

	public float getRecuperacion_de_prestamos() {
		return recuperacion_de_prestamos;
	}

	public void setRecuperacion_de_prestamos(float recuperacion_de_prestamos) {
		this.recuperacion_de_prestamos = recuperacion_de_prestamos;
	}

	public int getId_ingresos() {
		return id_ingreso;
	}

	public void setId_ingresos(int id_ingreso) {
		this.id_ingreso = id_ingreso;
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
