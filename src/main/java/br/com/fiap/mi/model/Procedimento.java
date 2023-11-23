package br.com.fiap.mi.model;

import br.com.fiap.mi.dto.DadosProcedimento;
import jakarta.persistence.Embeddable;

@Embeddable
public class Procedimento {

	private String nome_procedimento;
	private String data_procedimento;

	public Procedimento() {

	}

	public Procedimento(DadosProcedimento dados) {
		this.nome_procedimento = dados.nome_procedimento();
		this.data_procedimento = dados.data_procedimento();
	}

	public void atualizarInformacoes(DadosProcedimento dados) {
		if (dados.nome_procedimento() != null) {
			this.nome_procedimento = dados.nome_procedimento();
		}
		if (dados.data_procedimento() != null) {
			this.data_procedimento = dados.data_procedimento();
		}

	}

	public String getNome_procedimento() {
		return nome_procedimento;
	}

	public void setNome_procedimento(String nome_procedimento) {
		this.nome_procedimento = nome_procedimento;
	}

	public String getData_procedimento() {
		return data_procedimento;
	}

	public void setData_procedimento(String data_procedimento) {
		this.data_procedimento = data_procedimento;
	}

}