package br.com.fiap.mi.model;

import br.com.fiap.mi.dto.RequisicaoNovoSuporte;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Suporte")
@Table(name = "Suporte")
public class Suporte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String descricao;
	
	private Boolean ativo;

	public Suporte() {

	}
	
	public Suporte(RequisicaoNovoSuporte requisicao) {
		this.ativo = true;
		this.nome = requisicao.nome();
		this.email = requisicao.email();
		this.descricao = requisicao.descricao();
		
	}
	
	public void excluir() {
		this.ativo = false;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}