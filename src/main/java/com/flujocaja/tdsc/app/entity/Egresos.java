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
@Table(name = "Egresos")
public class Egresos implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_egresos;
	
	/*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dni_id", referencedColumnName = "number") */
	private int id_cuenta;
	
	@Column(nullable=false)
	private Date fecha;
	
	@Column(nullable=true)
	private String salario_neto;
	
	@Column(nullable=true)
	private String cuota_obrera;
	
	@Column(nullable=true)
	private String cuota_patronal;
	
	@Column(nullable=true)
	private String servicios_no_personales;
	
	@Column(nullable=true)
	private String materiales_suministros;
	
	@Column(nullable=true)
	private String maquinaria_equipo;
	
	@Column(nullable=true)
	private String inversion_financiera;
	
	@Column(nullable=true)
	private String construcciones_por_contrato;
	
	@Column(nullable=true)
	private String transf_recibidas;
	
	@Column(nullable=true)
	private String auditoria_contraloria;
	
	@Column(nullable=true)
	private String amortizacion_deuda;
	
	@Column(nullable=true)
	private String vigencia_exp_co;
	
	
	/* Get y Set */
	public int getId_egresos() {
		return id_egresos;
	}
	public void setId_egresos(int id_egresos) {
		this.id_egresos = id_egresos;
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
	public String getSalario_neto() {
		return salario_neto;
	}
	public void setSalario_neto(String salario_neto) {
		this.salario_neto = salario_neto;
	}
	public String getCuota_obrera() {
		return cuota_obrera;
	}
	public void setCuota_obrera(String cuota_obrera) {
		this.cuota_obrera = cuota_obrera;
	}
	public String getCuota_patronal() {
		return cuota_patronal;
	}
	public void setCuota_patronal(String cuota_patronal) {
		this.cuota_patronal = cuota_patronal;
	}
	public String getServicios_no_personales() {
		return servicios_no_personales;
	}
	public void setServicios_no_personales(String servicios_no_personales) {
		this.servicios_no_personales = servicios_no_personales;
	}
	public String getMateriales_suministros() {
		return materiales_suministros;
	}
	public void setMateriales_suministros(String materiales_suministros) {
		this.materiales_suministros = materiales_suministros;
	}
	public String getMaquinaria_equipo() {
		return maquinaria_equipo;
	}
	public void setMaquinaria_equipo(String maquinaria_equipo) {
		this.maquinaria_equipo = maquinaria_equipo;
	}
	public String getInversion_financiera() {
		return inversion_financiera;
	}
	public void setInversion_financiera(String inversion_financiera) {
		this.inversion_financiera = inversion_financiera;
	}
	public String getConstrucciones_por_contrato() {
		return construcciones_por_contrato;
	}
	public void setConstrucciones_por_contrato(String construcciones_por_contrato) {
		this.construcciones_por_contrato = construcciones_por_contrato;
	}
	public String getTransf_recibidas() {
		return transf_recibidas;
	}
	public void setTransf_recibidas(String transf_recibidas) {
		this.transf_recibidas = transf_recibidas;
	}
	public String getAuditoria_contraloria() {
		return auditoria_contraloria;
	}
	public void setAuditoria_contraloria(String auditoria_contraloria) {
		this.auditoria_contraloria = auditoria_contraloria;
	}
	public String getAmortizacion_deuda() {
		return amortizacion_deuda;
	}
	public void setAmortizacion_deuda(String amortizacion_deuda) {
		this.amortizacion_deuda = amortizacion_deuda;
	}
	public String getVigencia_exp_co() {
		return vigencia_exp_co;
	}
	public void setVigencia_exp_co(String vigencia_exp_co) {
		this.vigencia_exp_co = vigencia_exp_co;
	}
	
	
	
	
	
}
