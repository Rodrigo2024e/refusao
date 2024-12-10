package com.smartprocessrefusao.refusao.entities;

import java.util.ArrayList;
import java.util.List;

import com.smartprocessrefusao.refusao.services.MovMaterial;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_PesJuridica")
public class PessoaJuridica extends CadastroPessoa{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cnpj;
	private String ie;
	
	
	@OneToMany(mappedBy = "parceiro")
	private List<MovMaterial> movmateriais = new ArrayList<>();
	
	
	
	public PessoaJuridica() {
		
	}

	/**
	 * @param id
	 * @param tipo
	 * @param nome
	 * @param email
	 * @param telefone
	 * @param logradouro
	 * @param numero
	 * @param complemento
	 * @param bairro
	 * @param cidade
	 * @param cep
	 * @param estado
	 * @param uf
	 * @param cnpj
	 * @param ie
	 */
	public PessoaJuridica(Long id, char tipo, String nome, String email, String telefone, String logradouro, int numero,
			String complemento, String bairro, String cidade, String cep, String estado, String uf, String cnpj,
			String ie) {
		super(id, tipo, nome, email, telefone, logradouro, numero, complemento, bairro, cidade, cep, estado, uf);
		this.cnpj = cnpj;
		this.ie = ie;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}


}
