package com.smartprocessrefusao.refusao.services;

import java.time.LocalDate;
import java.util.Objects;

import com.smartprocessrefusao.refusao.entities.CadastroMaterial;
import com.smartprocessrefusao.refusao.entities.PessoaJuridica;
import com.smartprocessrefusao.refusao.entities.TipoGasto;
import com.smartprocessrefusao.refusao.entities.TipoOperacao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_mov_materiais")
public class MovMaterial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate data;
	private String placaVeiculo;
	private String numTicket;
	private double pesoBruto;
	private double rendimento;
	private double pesoLiquido;
	private double escoria;
	/**
	 * 
	 */
	
	@ManyToOne
	@JoinColumn(name = "material_id")
	private CadastroMaterial material;
	
	@ManyToOne
	@JoinColumn(name = "gastos_id")
	private TipoGasto gastos;
	
	@ManyToOne
	@JoinColumn(name = "operacao_id")
	private TipoOperacao operacao;
	
	@ManyToOne
	@JoinColumn(name = "parceiro_id")
	private PessoaJuridica parceiro;
	
	
	
	public MovMaterial() {
		
	}
	/**
	 * @param id
	 * @param data
	 * @param placaVeiculo
	 * @param numTicket
	 * @param pesoBruto
	 * @param rendimento
	 * @param pesoLiquido
	 * @param escoria
	 */
	public MovMaterial(Long id, LocalDate data, String placaVeiculo, String numTicket, double pesoBruto,
			double rendimento, double pesoLiquido, double escoria) {
		super();
		this.id = id;
		this.data = data;
		this.placaVeiculo = placaVeiculo;
		this.numTicket = numTicket;
		this.pesoBruto = pesoBruto;
		this.rendimento = rendimento;
		this.pesoLiquido = pesoLiquido;
		this.escoria = escoria;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getPlacaVeiculo() {
		return placaVeiculo;
	}
	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}
	public String getNumTicket() {
		return numTicket;
	}
	public void setNumTicket(String numTicket) {
		this.numTicket = numTicket;
	}
	public double getPesoBruto() {
		return pesoBruto;
	}
	public void setPesoBruto(double pesoBruto) {
		this.pesoBruto = pesoBruto;
	}
	public double getRendimento() {
		return rendimento;
	}
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	public double getPesoLiquido() {
		pesoLiquido = pesoBruto * rendimento;
		return pesoLiquido;
	}
	
	public void setPesoLiquido(double pesoLiquido) {
		this.pesoLiquido = pesoLiquido;
	}
	
	public double getEscoria() {
		escoria = pesoBruto - pesoLiquido;
		return escoria;
	}
	
	
	public void setEscoria(double escoria) {
		this.escoria = escoria;
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
		MovMaterial other = (MovMaterial) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
}
