package br.com.fiap.mi.medicamentos;

import jakarta.validation.constraints.NotBlank;

public record DadosMedicamentos(
		@NotBlank
		String nome_medicamento
	) {}
