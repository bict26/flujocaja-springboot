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
	private float salario_neto;
	
	@Column(nullable=true)
	private float cuota_obrera;
	
	@Column(nullable=true)
	private float cuota_patronal;
	
	@Column(nullable=true)
	private float servicios_no_personales;
	
	@Column(nullable=true)
	private float materiales_suministros;
	
	@Column(nullable=true)
	private float maquinaria_equipo;
	
	@Column(nullable=true)
	private float inversion_financiera;
	
	@Column(nullable=true)
	private float construcciones_por_contrato;
	
	@Column(nullable=true)
	private float transf_corrientes;
	
	@Column(nullable=true)
	private float auditoria_contraloria;
	
	@Column(nullable=true)
	private float amortizacion_deuda;
	
	@Column(nullable=true) 
	private float vigencia_exp_corriente;
	
	@Column(nullable=true) 
	private float transf_capital;
	
	@Column(nullable=true)
	private float inversiones;
	
	@Column(nullable=true)
	private float inversion_fisica;
	
	@Column(nullable=true)
	private float inversiones_financieras_ejec_prog;
	
	@Column(nullable=true)
	private float vigencia_expirada_inversion;
	
	@Column(nullable=true)
	private float depositos_favor_terceros;
	
	@Column(nullable=true)
	private float transf_entregadas;
	
	@Column(nullable=true)
	private float total_egresos;

	
	// get y set----------------------------------------
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

	public float getSalario_neto() {
		return salario_neto;
	}

	public void setSalario_neto(float salario_neto) {
		this.salario_neto = salario_neto;
	}

	public float getCuota_obrera() {
		return cuota_obrera;
	}

	public void setCuota_obrera(float cuota_obrera) {
		this.cuota_obrera = cuota_obrera;
	}

	public float getCuota_patronal() {
		return cuota_patronal;
	}

	public void setCuota_patronal(float cuota_patronal) {
		this.cuota_patronal = cuota_patronal;
	}

	public float getServicios_no_personales() {
		return servicios_no_personales;
	}

	public void setServicios_no_personales(float servicios_no_personales) {
		this.servicios_no_personales = servicios_no_personales;
	}

	public float getMateriales_suministros() {
		return materiales_suministros;
	}

	public void setMateriales_suministros(float materiales_suministros) {
		this.materiales_suministros = materiales_suministros;
	}

	public float getMaquinaria_equipo() {
		return maquinaria_equipo;
	}

	public void setMaquinaria_equipo(float maquinaria_equipo) {
		this.maquinaria_equipo = maquinaria_equipo;
	}

	public float getInversion_financiera() {
		return inversion_financiera;
	}

	public void setInversion_financiera(float inversion_financiera) {
		this.inversion_financiera = inversion_financiera;
	}

	public float getConstrucciones_por_contrato() {
		return construcciones_por_contrato;
	}

	public void setConstrucciones_por_contrato(float construcciones_por_contrato) {
		this.construcciones_por_contrato = construcciones_por_contrato;
	}

	public float getTransf_corrientes() {
		return transf_corrientes;
	}

	public void setTransf_corrientes(float transf_corrientes) {
		this.transf_corrientes = transf_corrientes;
	}

	public float getAuditoria_contraloria() {
		return auditoria_contraloria;
	}

	public void setAuditoria_contraloria(float auditoria_contraloria) {
		this.auditoria_contraloria = auditoria_contraloria;
	}

	public float getAmortizacion_deuda() {
		return amortizacion_deuda;
	}

	public void setAmortizacion_deuda(float amortizacion_deuda) {
		this.amortizacion_deuda = amortizacion_deuda;
	}

	public float getVigencia_exp_corriente() {
		return vigencia_exp_corriente;
	}

	public void setVigencia_exp_corriente(float vigencia_exp_corriente) {
		this.vigencia_exp_corriente = vigencia_exp_corriente;
	}

	public float getTransf_capital() {
		return transf_capital;
	}

	public void setTransf_capital(float transf_capital) {
		this.transf_capital = transf_capital;
	}

	public float getInversiones() {
		return inversiones;
	}

	public void setInversiones(float inversiones) {
		this.inversiones = inversiones;
	}

	public float getInversion_fisica() {
		return inversion_fisica;
	}

	public void setInversion_fisica(float inversion_fisica) {
		this.inversion_fisica = inversion_fisica;
	}

	public float getInversiones_financieras_ejec_prog() {
		return inversiones_financieras_ejec_prog;
	}

	public void setInversiones_financieras_ejec_prog(float inversiones_financieras_ejec_prog) {
		this.inversiones_financieras_ejec_prog = inversiones_financieras_ejec_prog;
	}

	public float getVigencia_expirada_inversion() {
		return vigencia_expirada_inversion;
	}

	public void setVigencia_expirada_inversion(float vigencia_expirada_inversion) {
		this.vigencia_expirada_inversion = vigencia_expirada_inversion;
	}

	public float getDepositos_favor_terceros() {
		return depositos_favor_terceros;
	}

	public void setDepositos_favor_terceros(float depositos_favor_terceros) {
		this.depositos_favor_terceros = depositos_favor_terceros;
	}

	public float getTransf_entregadas() {
		return transf_entregadas;
	}

	public void setTransf_entregadas(float transf_entregadas) {
		this.transf_entregadas = transf_entregadas;
	}

	public float getTotal_egresos() {
		return total_egresos;
	}

	public void setTotal_egresos(float total_egresos) {
		this.total_egresos = total_egresos;
	}
	
	
	


	
	
	
	
}
