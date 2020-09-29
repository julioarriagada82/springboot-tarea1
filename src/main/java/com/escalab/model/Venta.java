package com.escalab.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVenta;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_vendedor", nullable = false, foreignKey = @ForeignKey(name = "FK_vendedor_venta"))
	private Vendedor vendedor;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_cliente", nullable = false, foreignKey = @ForeignKey(name = "FK_cliente_venta"))
	private Cliente cliente;
	
	@Column(name = "costo", nullable = false, length = 9)
	private String costo;
	
	@Column(nullable = false)
	private LocalDateTime fecha_venta;

	public Integer getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}

	public String getCosto() {
		return costo;
	}

	public void setCosto(String costo) {
		this.costo = costo;
	}

	public LocalDateTime getFecha_venta() {
		return fecha_venta;
	}

	public void setFecha_venta(LocalDateTime fecha_venta) {
		this.fecha_venta = fecha_venta;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
