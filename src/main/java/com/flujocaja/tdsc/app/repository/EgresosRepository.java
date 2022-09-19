package com.flujocaja.tdsc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flujocaja.tdsc.app.entity.Egresos;
import com.flujocaja.tdsc.app.entity.EgresosTemp;

@Repository
public interface EgresosRepository extends JpaRepository<Egresos, Integer> {

	@Query(value = "SELECT MONTH(Fecha) Mes,id_egresos, id_cuenta,fecha, SUM(salario_neto) as salario_neto, SUM(cuota_obrera) as cuota_obrera, SUM(cuota_patronal) as cuota_patronal, SUM(servicios_no_personales) as servicios_no_personales, SUM(materiales_suministros) as materiales_suministros, SUM(maquinaria_equipo) as maquinaria_equipo, SUM(inversion_financiera) as inversion_financiera, SUM(construcciones_por_contrato) as construcciones_por_contrato, SUM(transf_corrientes) as transf_corrientes, SUM(auditoria_contraloria) as auditoria_contraloria, SUM(amortizacion_deuda) as amortizacion_deuda, SUM(vigencia_exp_corriente) as vigencia_exp_corriente, SUM(transf_capital) as transf_capital, SUM(inversiones) as inversiones, SUM(inversion_fisica) as inversion_fisica, SUM(inversiones_financieras_ejec_prog) as inversiones_financieras_ejec_prog, SUM(vigencia_expirada_inversion) as vigencia_expirada_inversion, SUM(depositos_favor_terceros) as depositos_favor_terceros, SUM(transf_entregadas) as transf_entregadas, SUM(total_egresos) as total_egresos FROM egresos WHERE id_cuenta = ?1 AND YEAR(fecha) = ?2 GROUP BY Mes", nativeQuery = true)
	public Iterable<Egresos> findEgresosByDate(int id_cuenta, String fecha);
	
	@Query(value = "SELECT MONTH(Fecha) Mes,id_egresos, id_cuenta,fecha, SUM(salario_neto) as salario_neto, SUM(cuota_obrera) as cuota_obrera, SUM(cuota_patronal) as cuota_patronal, SUM(servicios_no_personales) as servicios_no_personales, SUM(materiales_suministros) as materiales_suministros, SUM(maquinaria_equipo) as maquinaria_equipo, SUM(inversion_financiera) as inversion_financiera, SUM(construcciones_por_contrato) as construcciones_por_contrato, SUM(transf_corrientes) as transf_corrientes, SUM(auditoria_contraloria) as auditoria_contraloria, SUM(amortizacion_deuda) as amortizacion_deuda, SUM(vigencia_exp_corriente) as vigencia_exp_corriente, SUM(transf_capital) as transf_capital, SUM(inversiones) as inversiones, SUM(inversion_fisica) as inversion_fisica, SUM(inversiones_financieras_ejec_prog) as inversiones_financieras_ejec_prog, SUM(vigencia_expirada_inversion) as vigencia_expirada_inversion, SUM(depositos_favor_terceros) as depositos_favor_terceros, SUM(transf_entregadas) as transf_entregadas, SUM(total_egresos) as total_egresos FROM egresos e INNER JOIN cuentas c ON c.id_cuentas = e.id_cuenta WHERE c.id_unidad = ?1 AND YEAR(fecha) = ?2 GROUP BY Mes", nativeQuery = true)
	public Iterable<Egresos> findEgresosByUnidad(int id_unidad, String year);
	
	@Query(value = "SELECT MONTH(Fecha) Mes,id_egresos, id_cuenta,fecha, SUM(salario_neto) as salario_neto, SUM(cuota_obrera) as cuota_obrera, SUM(cuota_patronal) as cuota_patronal, SUM(servicios_no_personales) as servicios_no_personales, SUM(materiales_suministros) as materiales_suministros, SUM(maquinaria_equipo) as maquinaria_equipo, SUM(inversion_financiera) as inversion_financiera, SUM(construcciones_por_contrato) as construcciones_por_contrato, SUM(transf_corrientes) as transf_corrientes, SUM(auditoria_contraloria) as auditoria_contraloria, SUM(amortizacion_deuda) as amortizacion_deuda, SUM(vigencia_exp_corriente) as vigencia_exp_corriente, SUM(transf_capital) as transf_capital, SUM(inversiones) as inversiones, SUM(inversion_fisica) as inversion_fisica, SUM(inversiones_financieras_ejec_prog) as inversiones_financieras_ejec_prog, SUM(vigencia_expirada_inversion) as vigencia_expirada_inversion, SUM(depositos_favor_terceros) as depositos_favor_terceros, SUM(transf_entregadas) as transf_entregadas, SUM(total_egresos) as total_egresos FROM egresos WHERE YEAR(fecha) = ?1 GROUP BY Mes", nativeQuery = true)
	public Iterable<Egresos> findAllEgresosByYear(String year);
	
	@Query(value = "SELECT * FROM egresos  WHERE id_cuenta = ?1 AND DATE(fecha) = ?2", nativeQuery = true)
	public Iterable<Egresos> findEgresosByDateM(int id_cuenta, String fecha);
	
}
