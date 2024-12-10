package com.smartprocessrefusao.refusao.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.smartprocessrefusao.refusao.services.MovMaterial;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "tb_cad_material")
public class CadastroMaterial {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricaoMaterial;
	
	
	@ManyToOne
	@JoinColumn(name = "cad_unidade_id")
	private CadastroUnidades cad_unidade;
	
	
	@ManyToOne
	@JoinColumn(name = "gp_material_id")
	private GrupoMaterial gpmaterial;
	
	
	@OneToMany(mappedBy = "material")
	private List<MovMaterial> movmateriais = new ArrayList<>();
	
	
	public CadastroMaterial () {
		
	}


	/**
	 * @param id
	 * @param descricaoMaterial
	 */
	public CadastroMaterial(Long id, String descricaoMaterial) {
		super();
		this.id = id;
		this.descricaoMaterial = descricaoMaterial;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescricaoMaterial() {
		return descricaoMaterial;
	}


	public void setDescricaoMaterial(String descricaoMaterial) {
		this.descricaoMaterial = descricaoMaterial;
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
		CadastroMaterial other = (CadastroMaterial) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
