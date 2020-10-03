package br.edu.tcc.entidade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "chamada")
public class Chamada {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idChamada;
	
	@OneToMany(mappedBy = "chamada", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<Aluno> aluno;

	@OneToOne(mappedBy = "chamada", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private Aula aula;

	public Long getIdChamada() {
		return idChamada;
	}

	public void setIdChamada(Long idChamada) {
		this.idChamada = idChamada;
	}

	public List<Aluno> getAluno() {
		return aluno;
	}

	public void setAluno(List<Aluno> aluno) {
		this.aluno = aluno;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

}
