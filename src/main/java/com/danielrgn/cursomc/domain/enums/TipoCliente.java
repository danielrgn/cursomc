package com.danielrgn.cursomc.domain.enums;

public enum TipoCliente {
	
	PESSOAFISICA(1, "Pessoa Fisica"),
	PESSOAJURIDICA(2, "Pessoa Juridica");
	
	private Integer id;
	private String tipo;
	
	private TipoCliente(Integer id, String tipo) {
		this.id = id;
		this.tipo = tipo;
	}
	
	public Integer getId() {
		return id;
	}
	public String getTipo() {
		return tipo;
	}
	
	public static TipoCliente toEnum(Integer id) {
		
		if (id == null) {
			return null;
		}
		
		for (TipoCliente x : TipoCliente.values()) {
			if (x.getId().equals(id)) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id invalido" + id);
	}
}
