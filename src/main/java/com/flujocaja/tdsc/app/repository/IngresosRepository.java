package com.flujocaja.tdsc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flujocaja.tdsc.app.entity.Ingresos;

@Repository
public interface IngresosRepository extends JpaRepository<Ingresos, Integer>{

	@Query(value = "SELECT * FROM ingresos WHERE id_cuenta = ?1 AND YEAR(fecha) = ?2 ORDER BY fecha ASC", nativeQuery = true)
	public Iterable<Ingresos> findIngresosByDate(int id_cuenta, String fecha);
	
	@Query(value = "SELECT MONTH(Fecha) Mes, id_ingreso,id_cuenta, fecha, SUM(arrendamiento) as arrendamiento,SUM(venta_de_bienes) as venta_de_bienes,SUM(venta_de_servicios) as venta_de_servicios,SUM(tasas_y_derechos) as tasas_y_derechos,SUM(ingresos_varios) as ingresos_varios,SUM(transf_corrientes_gc) as transf_corrientes_gc,SUM(transf_corrientes_er) as transf_corrientes_er,SUM(transf_corrientes_vigencia_anterior) as transf_corrientes_vigencia_anterior,SUM(transf_de_capital) as transf_de_capital,SUM(aportes_de_capitral) as aportes_de_capitral,SUM(recuperacion_de_prestamos) as recuperacion_de_prestamos,SUM(venta_de_activos_t) as venta_de_activos_t,SUM(transf_de_capital_periodo_anterior) as transf_de_capital_periodo_anterior,SUM(depositos_favor_terceros_ing) as depositos_favor_terceros_ing,SUM(transf_recibidas) as transf_recibidas, SUM(total_ingresos) as total_ingresos FROM ingresos i INNER JOIN cuentas c ON c.id_cuentas= i.id_cuenta WHERE c.id_unidad = ?1 AND YEAR(fecha) = ?2 GROUP BY Mes", nativeQuery = true)
	public Iterable<Ingresos> findIngresosByUnidad(int id_unidad, String year);
	
	@Query(value = "SELECT MONTH(Fecha) Mes, id_ingreso,id_cuenta, fecha, SUM(arrendamiento) as arrendamiento,SUM(venta_de_bienes) as venta_de_bienes,SUM(venta_de_servicios) as venta_de_servicios,SUM(tasas_y_derechos) as tasas_y_derechos,SUM(ingresos_varios) as ingresos_varios,SUM(transf_corrientes_gc) as transf_corrientes_gc,SUM(transf_corrientes_er) as transf_corrientes_er,SUM(transf_corrientes_vigencia_anterior) as transf_corrientes_vigencia_anterior,SUM(transf_de_capital) as transf_de_capital,SUM(aportes_de_capitral) as aportes_de_capitral,SUM(recuperacion_de_prestamos) as recuperacion_de_prestamos,SUM(venta_de_activos_t) as venta_de_activos_t,SUM(transf_de_capital_periodo_anterior) as transf_de_capital_periodo_anterior,SUM(depositos_favor_terceros_ing) as depositos_favor_terceros_ing,SUM(transf_recibidas) as transf_recibidas, SUM(total_ingresos) as total_ingresos FROM ingresos WHERE YEAR(fecha) = ?1 GROUP BY Mes", nativeQuery = true)
	public Iterable<Ingresos> findIngresosByUnidad(String year);
}
