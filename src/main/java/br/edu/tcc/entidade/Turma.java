package br.edu.tcc.entidade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "turma")
public class Turma {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String sala;
	private int periodo;

	@OneToMany(mappedBy = "curso", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private Curso curso;

	@OneToMany(mappedBy = "aluno", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<Aluno> alunos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

}
