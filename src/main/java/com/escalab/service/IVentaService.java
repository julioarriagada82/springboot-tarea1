package com.escalab.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.escalab.model.Venta;

public interface IVentaService extends ICRUD<Venta> {

	Page<Venta> listarPageable(Pageable pageable);
}
