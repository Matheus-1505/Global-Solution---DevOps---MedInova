package br.com.fiap.mi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosProcedimento(
		
		@NotBlank
		String nome_procedimento,
		
		@Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}")
		String data_procedimento
		
		) {

}
