package com.flujocaja.tdsc.app.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.flujocaja.tdsc.app.entity.Cuentas;
import com.flujocaja.tdsc.app.entity.Ingresos;
import com.flujocaja.tdsc.app.repository.IngresosRepository;
import com.flujocaja.tdsc.app.service.CuentaService;
import com.flujocaja.tdsc.app.service.IngresosService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/ingresos")
public class IngresosController {


	@Autowired
	private IngresosService ingresosService;
	
	@Autowired
	private CuentaService cuentaService;
	
	@Autowired
	private IngresosRepository ingresosRepository;
	
	@PostMapping("/crear")
	public ResponseEntity<Ingresos> create (@RequestBody Ingresos ingresos){
		
		Optional<Cuentas> cuenta = cuentaService.findById(ingresos.getId_cuenta());
		
		if(!cuenta.isPresent()){
			return ResponseEntity.notFound().build();
		}
		
		try {
			
			return ResponseEntity.status(HttpStatus.CREATED).body(ingresosService.save(ingresos));
			
		} catch(DataAccessException e) {
			
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Ingresos> update(@RequestBody Ingresos ingresos){
		
		
		
		Optional<Cuentas> cuenta = cuentaService.findById(ingresos.getId_cuenta());
		
		if(!cuenta.isPresent()){
			return ResponseEntity.notFound().build();
		}
		
		try {
			
			return ResponseEntity.status(HttpStatus.CREATED).body(ingresosService.save(ingresos));
			
		} catch(DataAccessException e) {
			
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value = "id") Integer ingresosId){
		
		Optional<Ingresos> ingresos = ingresosService.findById(ingresosId);
		
		if(!ingresos.isPresent()){
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(ingresos);
	}
	
	// Read all ingresos
	@GetMapping
	public List<Ingresos> readAll () {
		List<Ingresos> ingresos = StreamSupport.stream(ingresosService.findAll().spliterator(), false).collect(Collectors.toList());
		return ingresos;
	}
	
	@GetMapping("/getingresos")
	@ResponseBody
	public List<Ingresos> getIngresos(@RequestParam int id_cuenta, @RequestParam String fecha){
		
		List<Ingresos> ingresos = StreamSupport
				.stream(ingresosRepository.findIngresosByDate(id_cuenta, fecha).spliterator(), false)
				.collect(Collectors.toList());
		
		return ingresos; 
	}
	
	@GetMapping("/getingresosUnidad")
	@ResponseBody
	public List<Ingresos> getIngresosUnidad(@RequestParam int id_unidad,@RequestParam String year){
		List <Ingresos> ingresos = StreamSupport 
				.stream(ingresosRepository.findIngresosByUnidad(id_unidad, year).spliterator(), false)
				.collect(Collectors.toList());
		
		return ingresos;
	}

}
