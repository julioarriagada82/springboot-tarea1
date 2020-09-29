package com.escalab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "supervisor")
public class Supervisor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	
	@Size(min = 3, message = "Nombres debe tener mínimo 3 caracteres")
	@Column(name = "nombre", nullable = false, length = 70)
	private String nombre;
	
	@Column(name = "supervisor", nullable = false, length = 200)
	private String supervisor;
	
	@Size(min = 8, max = 150, message = "Dirección debe tener minimo 3 caracteres")
	@Column(name = "direccion", nullable = false, length = 150)
	private String direccion;
	
	@Size(min = 9, max = 9, message = "Telefono debe tener 9 caracteres")
	@Column(name = "telefono", nullable = false, length = 9)
	private String telefono;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
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
}
