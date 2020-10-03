package br.edu.tcc.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.edu.tcc.entidade.Aluno;
import br.edu.tcc.entidade.Aula;
import br.edu.tcc.entidade.Chamada;

public class ChamadaDto {

	private Long idChamada;
	private Aluno aluno;
	private Aula aula;

	public ChamadaDto(Chamada chamada) {
		super();
		this.idChamada = chamada.getIdChamada();
		this.aula = getAula();
	}

	public static List<ChamadaDto> converter(List<Chamada> chamada) {
		return chamada.stream().map(ChamadaDto::new).collect(Collectors.toList());
	}

	public Long getIdChamada() {
		return idChamada;
	}

	public void setIdChamada(Long idChamada) {
		this.idChamada = idChamada;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

}
