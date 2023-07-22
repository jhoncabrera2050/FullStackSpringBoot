package com.ventas.ventas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	@NotNull
	@NotBlank(message = "el nombre es obligatorio")
	@Size(min = 3,max =70, message = "el nombre debe ser mayor a 3 caracteres")
	@Column(name="nombres", nullable=false,length = 70)
	private String nombres;
	@NotNull
	@NotBlank(message = "los apellidos son obligatorios")
	@Size(min = 3,max =70, message = "los apellidos deben ser mayor a 3 caracteres")
	@Column(name="apellidos", nullable=false,length = 150)
	private String apellidos;
	@Size(min =8, max = 150, message="la direccion no debe superar los 150 caracteres")
	@Column(name="direccion", nullable=false,length = 150)
	private String direccion;
	@Size(min =8, message="el telefono debe tener 8 caracteres como minimo")
	@Column(name="telefono", nullable=false,length = 10)
	private String telefono;
	@NotNull
	@NotBlank(message="el email es obligatorio")
	@Column(nullable=false,length = 150)
	private String email;
	
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
