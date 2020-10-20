package com.escalab.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.escalab.model.Vendedor;

public interface IVendedorService extends ICRUD<Vendedor> {

	Page<Vendedor> listarPageable(Pageable pageable);
}
