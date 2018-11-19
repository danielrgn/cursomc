package com.danielrgn.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielrgn.cursomc.domain.Cliente;
import com.danielrgn.cursomc.repositories.ClienteRepository;
import com.danielrgn.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository ClienteRepository;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> cat = ClienteRepository.findById(id);
		return cat.orElseThrow(() -> 
				new ObjectNotFoundException("Objeto não encontrado! Id: "+ id + 
				", Tipo: " + Cliente.class.getName()));
	}
}
