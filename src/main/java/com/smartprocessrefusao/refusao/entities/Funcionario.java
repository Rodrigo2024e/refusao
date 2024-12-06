package com.smartprocessrefusao.refusao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario extends CadastroPessoa  {
	private static final long serialVersionUID = 1L;
	private String cpf;
	private String rg;
	private String matricula;
	private boolean usuarioSistema;
	
	@ManyToOne
	@JoinColumn(name = "processo_id")
	private Processo processo;
	
	
	public Funcionario() {
		
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
	 * @param cpf
	 * @param rg
	 * @param matricula
	 * @param usuarioSistema
	 */
	public Funcionario(Long id, char tipo, String nome, String email, String telefone, String logradouro, int numero,
			String complemento, String bairro, String cidade, String cep, String estado, String uf, String cpf,
			String rg, String matricula, boolean usuarioSistema) {
		super(id, tipo, nome, email, telefone, logradouro, numero, complemento, bairro, cidade, cep, estado, uf);
		this.cpf = cpf;
		this.rg = rg;
		this.matricula = matricula;
		this.usuarioSistema = usuarioSistema;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public boolean isUsuarioSistema() {
		return usuarioSistema;
	}

	public void setUsuarioSistema(boolean usuarioSistema) {
		this.usuarioSistema = usuarioSistema;
	}

	

}
