package com.uts.invoice.programacion.web.services;

import java.util.List;

import com.uts.invoice.programacion.web.models.entities.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public void save(Cliente cliente);
	
	public Cliente findById(Long id);
	
	public void delete(Long id);

}
