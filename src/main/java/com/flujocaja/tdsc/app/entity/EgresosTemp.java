package com.flujocaja.tdsc.app.entity;

import java.io.Serializable;

public class EgresosTemp implements Serializable{
	
	private float amortizacion_deuda;
	private float auditoria_contraloria;
	

	public EgresosTemp() {
		// TODO Auto-generated constructor stub
	}
	
	public EgresosTemp(float amortizacion_deuda, float auditoria_contraloria) {
		super();
		this.amortizacion_deuda = amortizacion_deuda;
		this.auditoria_contraloria = auditoria_contraloria;
	}
	


	public float getAmortizacion_deuda() {
		return amortizacion_deuda;
	}


	public void setAmortizacion_deuda(float amortizacion_deuda) {
		this.amortizacion_deuda = amortizacion_deuda;
	}


	public float getAuditoria_contraloria() {
		return auditoria_contraloria;
	}


	public void setAuditoria_contraloria(float auditoria_contraloria) {
		this.auditoria_contraloria = auditoria_contraloria;
	}


	

}
