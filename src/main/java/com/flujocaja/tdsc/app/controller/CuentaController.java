package com.flujocaja.tdsc.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flujocaja.tdsc.app.entity.Cuentas;
import com.flujocaja.tdsc.app.service.CuentaService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/cuenta")
public class CuentaController {
	
	@Autowired
	private CuentaService cuentaService;
	
	@GetMapping("/getcuentas/{id}")
	public List<Cuentas> getCuentas (@PathVariable(value = "id") int id_unidad){
		
		System.out.println("ID DE LA UNIDAD> " + id_unidad);
		
		List<Cuentas> cuentas = cuentaService.findAllByIdUnidad(id_unidad);
				
				
		return cuentas;
	}
	
	
	

}
