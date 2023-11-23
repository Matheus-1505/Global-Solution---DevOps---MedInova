package br.com.fiap.mi.medicamentos;

import jakarta.persistence.Embeddable;

@Embeddable
public class Medicamentos {

	private String nome_medicamento;

	public Medicamentos() {
	}
	
	public Medicamentos(DadosMedicamentos dados) {
		this.nome_medicamento = dados.nome_medicamento();
		
	}
	
	public void atualizarInformacoes(DadosMedicamentos dados) {
		if (dados.nome_medicamento() != null) {
			this.nome_medicamento = dados.nome_medicamento();
		}
		
	}

	public String getNome_medicamento() {
		return nome_medicamento;
	}

	public void setNome_medicamento(String nome_medicamento) {
		this.nome_medicamento = nome_medicamento;
	}

}
