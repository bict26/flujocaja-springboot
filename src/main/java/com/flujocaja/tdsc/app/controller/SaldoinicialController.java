package com.flujocaja.tdsc.app.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.flujocaja.tdsc.app.entity.Cuentas;
import com.flujocaja.tdsc.app.entity.Saldo_inicial;
import com.flujocaja.tdsc.app.repository.SaldoInicialRepository;
import com.flujocaja.tdsc.app.service.CuentaService;
import com.flujocaja.tdsc.app.service.SaldoInicialService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/saldoinicial")
public class SaldoinicialController {

	@Autowired
	private SaldoInicialService saldoinicialService;
	
	@Autowired
	private CuentaService cuentaService;
	
	@Autowired
	private SaldoInicialRepository saldoinicialRepository;
	
	@PostMapping("/crear")
	public ResponseEntity<Saldo_inicial> create (@RequestBody Saldo_inicial saldo_inicial){
		
		Optional<Cuentas> cuenta = cuentaService.findById(saldo_inicial.getId_cuenta());
		
		if(!cuenta.isPresent()){
			return ResponseEntity.notFound().build();
		}
		
		try {
			
			return ResponseEntity.status(HttpStatus.CREATED).body(saldoinicialService.save(saldo_inicial));
			
		} catch(DataAccessException e) {
			
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		 
	}
	
	
	@GetMapping("/getsaldo_inicial")
	@ResponseBody
	public ResponseEntity<Saldo_inicial> getSaldo_inicial(@RequestParam int id_cuenta, @RequestParam String fecha){
		
		Saldo_inicial saldo_inicial = saldoinicialRepository.findByAccountId(id_cuenta, fecha);
		
		return ResponseEntity.ok(saldo_inicial);
	}
	
	

}
