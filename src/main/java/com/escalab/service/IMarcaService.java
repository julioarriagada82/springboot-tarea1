package com.escalab.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.escalab.model.Marca;

public interface IMarcaService extends ICRUD<Marca> {

	Page<Marca> listarPageable(Pageable pageable);
}
