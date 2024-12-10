package com.smartprocessrefusao.refusao.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="tb_produto")
public class Produto extends CadastroMaterial {

	private static final long serialVersionUID = 1L;
	
	private String liga;
	private Integer polegada;
	private Integer metragem;
	/**
	 * 
	 */
	@ManyToOne
	@JoinColumn(name = "liga_id")
	private CadastroLiga ligas;
	
//	@ManyToOne
//	@JoinColumn(name = "gp_material_id")
//	private GrupoMaterial gpmaterial;
	
	
//	@ManyToOne
//	@JoinColumn(name = "cad_unidade_id")
//	private CadastroUnidades cad_unidade;
	
	
	
	public Produto() {
		
	}



	/**
	 * @param id
	 * @param descricaoMaterial
	 * @param liga
	 * @param polegada
	 * @param metragem
	 * @param ligas
	 * @param gpmaterial
	 * @param cad_unidade
	 */
	public Produto(Long id, String descricaoMaterial, String liga, Integer polegada, Integer metragem,
			CadastroLiga ligas, GrupoMaterial gpmaterial, CadastroUnidades cad_unidade) {
		super(id, descricaoMaterial);
		this.liga = liga;
		this.polegada = polegada;
		this.metragem = metragem;
		
	
	}



	public String getLiga() {
		return liga;
	}



	public void setLiga(String liga) {
		this.liga = liga;
	}



	public Integer getPolegada() {
		return polegada;
	}



	public void setPolegada(Integer polegada) {
		this.polegada = polegada;
	}



	public Integer getMetragem() {
		return metragem;
	}



	public void setMetragem(Integer metragem) {
		this.metragem = metragem;
	}

	
	
}
