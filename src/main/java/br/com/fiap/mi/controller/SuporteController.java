package br.com.fiap.mi.controller;

import org.springframework.data.domain.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.mi.dto.DadosListagemSuporte;
import br.com.fiap.mi.dto.RequisicaoNovoSuporte;
import br.com.fiap.mi.model.Suporte;
import br.com.fiap.mi.repository.SuporteRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/suporte")
public class SuporteController {
	
	@Autowired
	private SuporteRepository repository;
	
	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid RequisicaoNovoSuporte dados) {
		repository.save(new Suporte(dados));
	}
	
	@GetMapping
	public Page<DadosListagemSuporte> listar(
			@PageableDefault(size=3, sort = {"nome"})
			Pageable paginacao) {
		return repository.findAllByAtivoTrue(paginacao).map(DadosListagemSuporte :: new);
	}
	
	
	@DeleteMapping("/{id}")
	@Transactional
	public void excluir(@PathVariable Long id) {
		Suporte suporte = new Suporte();
		suporte = repository.getReferenceById(id);
		suporte.excluir();
	}

}