package br.com.fiap.mi.dto;

import br.com.fiap.mi.medicamentos.DadosMedicamentos;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroPaciente(
		@NotBlank
		String nome,		
		@NotBlank
		String problema_saude,

		@NotNull @Valid DadosMedicamentos medicamentos,
		
		@NotNull @Valid DadosLeito leito,
		
		@NotNull @Valid DadosProcedimento procedimento
	) {}
