package com.smartprocessrefusao.refusao.entities;

import java.util.Objects;

public class TipoGastos {

	private Long id;
	private String descricaoGastos;
	
	public TipoGastos() {
		
	}

	/**
	 * @param id
	 * @param descricaoGastos
	 */
	public TipoGastos(Long id, String descricaoGastos) {
		super();
		this.id = id;
		this.descricaoGastos = descricaoGastos;
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaoGastos() {
		return descricaoGastos;
	}

	public void setDescricaoGastos(String descricaoGastos) {
		this.descricaoGastos = descricaoGastos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoGastos other = (TipoGastos) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
