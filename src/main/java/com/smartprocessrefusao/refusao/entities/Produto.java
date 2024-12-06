package com.smartprocessrefusao.refusao.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricaoProd;
	/**
	 * 
	 */
	
	@ManyToOne
	@JoinColumn(name = "liga_id")
	private CadastroLigas liga;
	
	@ManyToOne
	@JoinColumn(name = "gp_material_id")
	private GrupoMaterial gpmaterial;
	
	
	@ManyToOne
	@JoinColumn(name = "cad_unidade_id")
	private CadastroUnidades cad_unidade;
	
	
	
	public Produto() {
		
	}
	/**
	 * @param id
	 * @param descricaoProd
	 */
	public Produto(Long id, String descricaoProd) {
		this.id = id;
		this.descricaoProd = descricaoProd;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricaoProd() {
		return descricaoProd;
	}
	public void setDescricaoProd(String descricaoProd) {
		this.descricaoProd = descricaoProd;
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
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);
	}
	
}
