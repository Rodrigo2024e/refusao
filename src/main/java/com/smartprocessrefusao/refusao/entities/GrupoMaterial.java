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
@Table(name = "tb_gp_material")
public class GrupoMaterial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricaoGP;
	
	@OneToMany(mappedBy = "gpmaterial")
	private List<CadastroMaterial> material = new ArrayList<>();
	
	@OneToMany(mappedBy = "gpmaterial")
	private List<Produto> produto = new ArrayList<>();
	
	public GrupoMaterial() {
		
	}

	/**
	 * @param id
	 * @param descricaoGP
	 */
	public GrupoMaterial(Long id, String descricaoGP) {
		super();
		this.id = id;
		this.descricaoGP = descricaoGP;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaoGP() {
		return descricaoGP;
	}

	public void setDescricaoGP(String descricaoGP) {
		this.descricaoGP = descricaoGP;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricaoGP, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GrupoMaterial other = (GrupoMaterial) obj;
		return Objects.equals(descricaoGP, other.descricaoGP) && Objects.equals(id, other.id);
	}
	
	
}
