package com.flujocaja.tdsc.app.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flujocaja.tdsc.app.entity.Ingresos;
import com.flujocaja.tdsc.app.service.IngresosService;

@RestController
@RequestMapping("/api/ingresos")
public class IngresosController {


	@Autowired
	private IngresosService ingresosService;
	
	@PostMapping
	public ResponseEntity<?> create (@RequestBody Ingresos ingresos){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(ingresosService.save(ingresos));
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

}
