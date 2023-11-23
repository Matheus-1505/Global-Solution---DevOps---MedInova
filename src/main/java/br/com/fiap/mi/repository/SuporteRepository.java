package br.com.fiap.mi.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.mi.model.Suporte;

public interface SuporteRepository extends JpaRepository<Suporte, Long>{

	Page<Suporte> findAllByAtivoTrue(Pageable paginacao);
}
