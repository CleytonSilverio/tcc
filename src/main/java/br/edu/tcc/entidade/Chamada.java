package br.edu.tcc.entidade;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Chamada {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idChamada;

	@OneToOne(mappedBy = "aluno", cascade = CascadeType.REMOVE)
	private Aluno aluno;

	@OneToOne(mappedBy = "aula", cascade = CascadeType.REMOVE)
	private Aula aula;

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
