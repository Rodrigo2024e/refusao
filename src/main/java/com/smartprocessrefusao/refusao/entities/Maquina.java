package com.smartprocessrefusao.refusao.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_maquina")
public class Maquina {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private String modelo;
	private String capacidade;
	private String fabricante;
	private String anoFabricacao;
	private String anoAquisicao;
	/**
	 * 
	 */
	public Maquina() {
		
	}
	/**
	 * @param id
	 * @param descricao
	 * @param modelo
	 * @param capacidade
	 * @param fabricante
	 * @param anoFabricacao
	 * @param anoAquisicao
	 */
	public Maquina(Long id, String descricao, String modelo, String capacidade, String fabricante, String anoFabricacao,
			String anoAquisicao) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.modelo = modelo;
		this.capacidade = capacidade;
		this.fabricante = fabricante;
		this.anoFabricacao = anoFabricacao;
		this.anoAquisicao = anoAquisicao;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getAnoAquisicao() {
		return anoAquisicao;
	}
	public void setAnoAquisicao(String anoAquisicao) {
		this.anoAquisicao = anoAquisicao;
		
		
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
		Maquina other = (Maquina) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
