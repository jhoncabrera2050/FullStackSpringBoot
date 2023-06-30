package com.ventas.ventas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventas.ventas.model.Cliente;
import com.ventas.ventas.repository.IClienteRepository;

@Service
public class ClienteService implements IClienteService {
	@Autowired
	private IClienteRepository clienteRepo;
	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return clienteRepo.findAll();
	}

	@Override
	public Optional<Cliente> findById(Integer id) {
		// TODO Auto-generated method stub
		return clienteRepo.findById(id);
	}

	@Override
	public Cliente create(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteRepo.save(cliente);
	}

	@Override
	public Cliente update(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteRepo.save(cliente);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		clienteRepo.deleteById(id);
	}

}
