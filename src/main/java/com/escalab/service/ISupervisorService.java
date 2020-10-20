package com.escalab.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.escalab.model.Supervisor;

public interface ISupervisorService extends ICRUD<Supervisor> {

	Page<Supervisor> listarPageable(Pageable pageable);
}
