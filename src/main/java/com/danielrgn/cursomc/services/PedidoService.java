package com.danielrgn.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielrgn.cursomc.domain.Pedido;
import com.danielrgn.cursomc.repositories.PedidoRepository;
import com.danielrgn.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> cat = pedidoRepository.findById(id);
		return cat.orElseThrow(() -> 
				new ObjectNotFoundException("Objeto não encontrado! Id: "+ id + 
				", Tipo: " + Pedido.class.getName()));
	}
}
