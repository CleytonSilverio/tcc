package br.edu.tcc.entidade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "aula")
public class Aula {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idAula;

	@OneToMany(mappedBy = "aula", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<Aluno> aluno;

	@OneToMany(mappedBy = "aula", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<Curso> cursos;

	@OneToOne
	@JoinColumn(name = "id_chamada")
	@JsonIgnore
	private Chamada chamada;

	@ManyToOne
	@JoinColumn(name = "id_calendario")
	@JsonIgnore
	private Calendario calendario;

	public long getIdAula() {
		return idAula;
	}

	public void setIdAula(long idAula) {
		this.idAula = idAula;
	}

	public List<Aluno> getAluno() {
		return aluno;
	}

	public void setAluno(List<Aluno> aluno) {
		this.aluno = aluno;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public Calendario getCalendario() {
		return calendario;
	}

	public void setCalendario(Calendario calendario) {
		this.calendario = calendario;
	}

	public Chamada getChamada() {
		return chamada;
	}

	public void setChamada(Chamada chamada) {
		this.chamada = chamada;
	}

}
