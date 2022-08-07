package com.flujocaja.tdsc.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flujocaja.tdsc.app.entity.Unidad;
import com.flujocaja.tdsc.app.service.UnidadService;

@RestController
@RequestMapping("/api/unidades")
public class UnidadController {
	
	@Autowired
	private UnidadService unidadService;
	
	@PostMapping
	public ResponseEntity<?> create (@RequestBody Unidad unidad){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(unidadService.save(unidad));
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value = "id") Integer unidadId){
		
		Optional<Unidad> unidad = unidadService.findById(unidadId);
		
		if(!unidad.isPresent()){
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(unidad);
	}

}
