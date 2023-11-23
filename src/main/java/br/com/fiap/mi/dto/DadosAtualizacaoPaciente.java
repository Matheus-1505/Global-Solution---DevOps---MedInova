package br.com.fiap.mi.dto;

import br.com.fiap.mi.medicamentos.DadosMedicamentos;
import jakarta.validation.constraints.NotNull;


public record DadosAtualizacaoPaciente(
		
		@NotNull
		Long id,
		String nome,
		String problema_saude,

		DadosMedicamentos medicamentos,
		
		DadosLeito leito,
		
		DadosProcedimento procedimento
		
		
		) {

	
	
}
