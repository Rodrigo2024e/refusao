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
@Table(name = "tb_tipo_operacao")
public class TipoOperacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricaoOperacao;
	
	@OneToMany(mappedBy = "operacao")
	private List<MovMaterial> movmateriais = new ArrayList<>();
	
	
	
	
	
	
	public TipoOperacao () {
		
	}

	/**
	 * @param id
	 * @param descricao
	 */
	public TipoOperacao(Long id, String descricaoOperacao) {
		this.id = id;
		this.descricaoOperacao = descricaoOperacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricaoOperacao;
	}

	public void setDescricao(String descricao) {
		this.descricaoOperacao = descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricaoOperacao, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoOperacao other = (TipoOperacao) obj;
		return Objects.equals(descricaoOperacao, other.descricaoOperacao) && Objects.equals(id, other.id);
	}
	
}
