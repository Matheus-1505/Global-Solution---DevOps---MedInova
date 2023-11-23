package br.com.fiap.mi.model;

import br.com.fiap.mi.dto.DadosLeito;
import jakarta.persistence.Embeddable;

@Embeddable
public class Leito {

	private String leito;

	Leito() {

	}

	Leito(DadosLeito dados) {
		this.leito = dados.leito();
	}

	public void atualizarInformacoes(DadosLeito dados) {
		if (dados.leito() != null) {
			this.leito = dados.leito();
		}

	}

	public String getLeito() {
		return leito;
	}

	public void setLeito(String leito) {
		this.leito = leito;
	}

}
