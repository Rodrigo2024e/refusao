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
@Table(name ="tb_setor")
public abstract class Setor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	protected String descricaoSetor;
	protected String centroCusto;

	@OneToMany(mappedBy = "setor")
	private List<Processo> processo = new ArrayList<>();
	
	
	public Setor() {
		
	}

	/**
	 * @param id
	 * @param descricaoSetor
	 * @param centroCusto
	 */
	public Setor(Long id, String descricaoSetor, String centroCusto) {
		super();
		this.id = id;
		this.descricaoSetor = descricaoSetor;
		this.centroCusto = centroCusto;
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
		Setor other = (Setor) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
