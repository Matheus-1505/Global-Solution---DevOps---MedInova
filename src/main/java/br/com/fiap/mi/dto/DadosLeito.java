package br.com.fiap.mi.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosLeito(
		
		@NotBlank
		String leito
		) {
	

}
