package com.flujocaja.tdsc.app.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name = "Colaborador")
public class Colaborador implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_colaborador;
	
	//@NotEmpty
	private String nombre; 
	
	//@NotEmpty
	private String apellido;
	
	private String username;
	
	
	private String roles;
	
	@Column(unique = true, nullable = false, length = 40)
	private String email; 
	
	@Column(nullable = false, length = 15)
	private String password; 
	
	
	private int id_unidad;
	
	//@NotNull
	//@Temporal(TemporalType.DATE)
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date last_login;
	
	
	public int getId_colaborador() {
		return id_colaborador;
	}
	public void setId_colaborador(int id_colaborador) {
		this.id_colaborador = id_colaborador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId_unidad() {
		return id_unidad;
	}
	public void setId_unidad(int id_unidad) {
		this.id_unidad = id_unidad;
	}
	public Date getLast_login() {
		return last_login;
	}
	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
	
	
	
}
