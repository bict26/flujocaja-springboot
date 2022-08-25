package com.flujocaja.tdsc.app.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.data.domain.Sort;
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
import org.springframework.web.bind.annotation.RestController;

import com.flujocaja.tdsc.app.entity.Cuentas;
import com.flujocaja.tdsc.app.entity.Egresos;
import com.flujocaja.tdsc.app.entity.Ingresos;
import com.flujocaja.tdsc.app.service.CuentaService;
import com.flujocaja.tdsc.app.service.EgresosService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/egresos")
public class EgresosController {

	@Autowired
	private EgresosService egresosService;
	
	
	@Autowired
	private CuentaService cuentaService;
	
	@PostMapping("/crear")
	public ResponseEntity<Egresos> create (@RequestBody Egresos egresos){
		
		Optional<Cuentas> cuenta = cuentaService.findById(egresos.getId_cuenta());
		
		if(!cuenta.isPresent()){
			return ResponseEntity.notFound().build();
		}
		
		try {
			
			return ResponseEntity.status(HttpStatus.CREATED).body(egresosService.save(egresos));
			
		} catch(DataAccessException e) {
			
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		 
	}
	
	@PutMapping("/update")
	public ResponseEntity<Egresos> update(@RequestBody Egresos egresos){
		
		
		
		Optional<Cuentas> cuenta = cuentaService.findById(egresos.getId_cuenta());
		
		if(!cuenta.isPresent()){
			return ResponseEntity.notFound().build();
		}
		
		try {
			
			return ResponseEntity.status(HttpStatus.CREATED).body(egresosService.save(egresos));
			
		} catch(DataAccessException e) {
			
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	
	
	
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value = "id") Integer egresosId){
		
		Optional<Egresos> egresos = egresosService.findById(egresosId);
		
		if(!egresos.isPresent()){
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(egresos);
	} 
	
	// Read all egresos
	@GetMapping
	public List<Egresos> readAll () {
		List<Egresos> egresos = StreamSupport
				.stream(egresosService.findAll(Sort.by(Sort.Direction.ASC, "fecha")).spliterator(), false)
				.collect(Collectors.toList());
		
		return egresos;
	}

}
