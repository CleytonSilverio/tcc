package br.edu.tcc.entidade;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int matricula;
	
	@Column(nullable = false, length = 50)
	@NotBlank(message = "Nome do aluno é obrigatório.")
	private String nome;
	
	@Transient
	private int flag; 
	
	private boolean presente;
	
	@ManyToOne
	@JoinColumn(name = "curso_id")
	@JsonIgnore
	private Curso cursos;
	
	@ManyToOne
	@JoinColumn(name = "turma_id")
	@JsonIgnore
	private Turma turmas;
	
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
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
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
	
	
}
