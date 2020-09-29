package com.escalab.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class CompraProductoPK implements Serializable {
	@ManyToOne
	@JoinColumn(name = "id_producto", nullable = false)
	private Producto producto;
	
	@ManyToOne
	@JoinColumn(name = "id_venta", nullable = false)
	private Venta venta;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((venta == null) ? 0 : venta.hashCode());
		result = prime * result + ((producto == null) ? 0 : producto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompraProductoPK other = (CompraProductoPK) obj;
		if (venta == null) {
			if (other.venta != null)
				return false;
		} else if (!venta.equals(other.venta))
			return false;
		if (producto == null) {
			if (other.producto != null)
				return false;
		} else if (!producto.equals(other.producto))
			return false;
		return true;
	}
}