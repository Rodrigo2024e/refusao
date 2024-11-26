package com.smartprocessrefusao.refusao.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="tb_funcionario")
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cpf;
	private String rg;
	private String matricula;
	private boolean usuarioSistema;
	
	public Funcionario() {

	}

	public Funcionario(Long id, String cpf, String rg, String matricula, boolean usuarioSistema) {
		this.id = id;
		this.cpf = cpf;
		this.rg = rg;
		this.matricula = matricula;
		this.usuarioSistema = usuarioSistema;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public int hashCode() {
		return Objects.hash(cpf, id, matricula, rg, usuarioSistema);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(id, other.id)
				&& Objects.equals(matricula, other.matricula) && Objects.equals(rg, other.rg)
				&& usuarioSistema == other.usuarioSistema;
	}

}
