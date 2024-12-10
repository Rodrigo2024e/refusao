package com.smartprocessrefusao.refusao.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="tb_processo")
public class Processo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricaoProcesso;
	
	@ManyToOne
	@JoinColumn(name = "setor_id")
	private Setor setor;
	
	
	@OneToMany(mappedBy = "processo")
	private List<Funcionario> funcionario = new ArrayList<>();
	
	public Processo() {
		
	}

	/**
	 * @param id
	 * @param descricaoProcesso
	 * @param setor
	 * @param funcionario
	 */
	public Processo(Long id, String descricaoProcesso, Setor setor, List<Funcionario> funcionario) {
		this.id = id;
		this.descricaoProcesso = descricaoProcesso;
		this.setor = setor;
		this.funcionario = funcionario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaoProcesso() {
		return descricaoProcesso;
	}

	public void setDescricaoProcesso(String descricaoProcesso) {
		this.descricaoProcesso = descricaoProcesso;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
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
		Processo other = (Processo) obj;
		return Objects.equals(id, other.id);
	}
	
}
