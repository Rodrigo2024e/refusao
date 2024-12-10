package com.smartprocessrefusao.refusao.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_un_medidas")
public class CadastroUnidades {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String sigla;
	private String descricaoUn;
	
	@OneToMany(mappedBy = "cad_unidade")
	private List<CadastroMaterial> material = new ArrayList<>();
	
	@OneToMany(mappedBy = "cad_unidade")
	private List<Produto> produto = new ArrayList<>();
	
	
	public CadastroUnidades () {
		
	}

	/**
	 * @param id
	 * @param sigla
	 * @param descricaoUn
	 */
	public CadastroUnidades(Long id, String sigla, String descricaoUn) {
		super();
		this.id = id;
		this.sigla = sigla;
		this.descricaoUn = descricaoUn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDescricaoUn() {
		return descricaoUn;
	}

	public void setDescricaoUn(String descricaoUn) {
		this.descricaoUn = descricaoUn;
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
		CadastroUnidades other = (CadastroUnidades) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
}
