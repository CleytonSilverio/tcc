package br.edu.tcc.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "aluno")
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int matricula;

	@Column(nullable = false, length = 50)
	@NotBlank(message = "Nome do aluno é obrigatório.")
	private String nome;

	private boolean presente;

	@ManyToOne
	@JoinColumn(name = "curso_id")
	@JsonIgnore
	private Curso cursos;

	@ManyToOne
	@JoinColumn(name = "turma_id")
	@JsonIgnore
	private Turma turmas;

	@ManyToOne
	@JoinColumn(name = "id_chamada")
	@JsonIgnore
	private Chamada chamada;

	@ManyToOne
	@JoinColumn(name = "id_aula")
	@JsonIgnore
	private Aula aula;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Curso getCursos() {
		return cursos;
	}

	public void setCursos(Curso cursos) {
		this.cursos = cursos;
	}

	public Turma getTurmas() {
		return turmas;
	}

	public void setTurmas(Turma turmas) {
		this.turmas = turmas;
	}

	public boolean isPresente() {
		return presente;
	}

	public void setPresente(boolean presente) {
		this.presente = presente;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	public Chamada getChamada() {
		return chamada;
	}

	public void setChamada(Chamada chamada) {
		this.chamada = chamada;
	}

}
