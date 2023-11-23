package br.com.fiap.mi.model;

import br.com.fiap.mi.dto.DadosAtualizacaoPaciente;
import br.com.fiap.mi.dto.DadosCadastroPaciente;
import br.com.fiap.mi.medicamentos.Medicamentos;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "pacientes")
@Entity(name = "Paciente")
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String problema_saude;

	@Embedded
	private Medicamentos medicamentos;

	@Embedded
	private Procedimento procedimento;

	@Embedded
	private Leito leito;

	private Boolean ativo;

	public Paciente() {
	}

	public Paciente(DadosCadastroPaciente dados) {
		this.ativo = true;
		this.nome = dados.nome();
		this.problema_saude = dados.problema_saude();
		this.medicamentos = new Medicamentos(dados.medicamentos());
		this.procedimento = new Procedimento(dados.procedimento());
		this.leito = new Leito(dados.leito());
	}

	public void atualizarInformacoes(DadosAtualizacaoPaciente dados) {
		if (dados.nome() != null) {
			this.nome = dados.nome();
		}
		if (dados.problema_saude() != null) {
			this.problema_saude = dados.problema_saude();
		}

		if (dados.medicamentos() != null) {
			this.medicamentos.atualizarInformacoes(dados.medicamentos());
		}

		if (dados.procedimento() != null) {
			this.procedimento.atualizarInformacoes(dados.procedimento());
		}
		if (dados.leito() != null) {
			this.leito.atualizarInformacoes(dados.leito());
		}

	}

	public void excluir() {
		this.ativo = false;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProblema_saude() {
		return problema_saude;
	}

	public void setProblema_saude(String problema_saude) {
		this.problema_saude = problema_saude;
	}

	public Medicamentos getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(Medicamentos medicamentos) {
		this.medicamentos = medicamentos;
	}

	public Procedimento getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(Procedimento procedimento) {
		this.procedimento = procedimento;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Leito getLeito() {
		return leito;
	}

	public void setLeito(Leito leito) {
		this.leito = leito;
	}

}
