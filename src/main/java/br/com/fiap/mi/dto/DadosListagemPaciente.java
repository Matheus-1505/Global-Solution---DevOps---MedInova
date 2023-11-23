package br.com.fiap.mi.dto;

import br.com.fiap.mi.model.Paciente;

public record DadosListagemPaciente(
		
		Long id,
		String nome,
		String problema_saude,
		String nome_procedimento
		
		) {
	
	public DadosListagemPaciente(Paciente paciente) {
		this(
				paciente.getId(),
				paciente.getNome(), 
				paciente.getProblema_saude(),
				paciente.getProcedimento().getNome_procedimento()
				
			);
	}

}
