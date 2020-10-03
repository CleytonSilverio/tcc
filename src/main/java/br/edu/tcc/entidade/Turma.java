package br.edu.tcc.entidade;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "turma")
public class Turma {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String sala;
	private int periodo;

	@ManyToOne
	@JoinColumn(name = "id_curso")
	@JsonIgnore
	private Curso curso;

	@OneToMany(mappedBy = "turma", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private Aluno alunos;

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

	public Aluno getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno alunos) {
		this.alunos = alunos;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

}
