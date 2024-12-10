package com.smartprocessrefusao.refusao.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.smartprocessrefusao.refusao.services.MovMaterial;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipo_gastos")
public class TipoGasto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricaoGastos;
	
	
	@OneToMany(mappedBy = "gastos")
	private List<MovMaterial> movmateriais = new ArrayList<>();
	
	
	
	public TipoGasto() {
		
	}

	/**
	 * @param id
	 * @param descricaoGastos
	 */
	public TipoGasto(Long id, String descricaoGastos) {
		
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
		TipoGasto other = (TipoGasto) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
