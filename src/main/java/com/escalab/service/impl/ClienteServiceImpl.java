package com.escalab.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.escalab.model.Cliente;
import com.escalab.repo.IClienteRepo;
import com.escalab.service.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService {
	@Autowired
	private IClienteRepo repo;
	
	@Override
	public Cliente registrar(Cliente obj) {
		return repo.save(obj);
	}
	
	@Override
	public Cliente modificar(Cliente obj) {
		return repo.save(obj);
	}
	
	@Override
	public List<Cliente> listar(){
		return repo.findAll();
	}
	
	@Override
	public Cliente leerPorId(Integer id) {
		Optional<Cliente> op =  repo.findById(id);
		return op.isPresent() ? op.get() : new Cliente();
	}
	
	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}
	
	@Override
	public Page<Cliente> listarPageable(Pageable pageable){
		return repo.findAll(pageable);
	}
}
