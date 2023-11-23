package br.com.fiap.mi.dto;

import br.com.fiap.mi.model.Suporte;

public record DadosListagemSuporte(
		
		Long id,
		String nome,
		String email,
		String descricao
		
		) {
	
	public DadosListagemSuporte(Suporte suporte) {
		this(
				suporte.getId(),
				suporte.getNome(),
				suporte.getEmail(),
				suporte.getDescricao()
				
			);
	}

}
