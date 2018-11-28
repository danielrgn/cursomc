package com.danielrgn.cursomc.domain.enums;

public enum EstadoPagamento {

	PENDENTE(1,"Pendente"),
	QUITADO(2,"Quitado"),
	CANCELADO(2,"Cancelado");
	
	private Integer id;
	private String tipo;
	
	private EstadoPagamento(Integer id, String tipo) {
		this.id = id;
		this.tipo = tipo;
	}
	
	public Integer getId() {
		return id;
	}
	public String getTipo() {
		return tipo;
	}
	
	public static EstadoPagamento toEnum(Integer id) {
		
		if (id == null) {
			return null;
		}
		
		for (EstadoPagamento x : EstadoPagamento.values()) {
			if (x.getId().equals(id)) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id invalido" + id);
	}
}
