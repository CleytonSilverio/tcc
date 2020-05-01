package br.edu.tcc.entidade;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="curso")
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable = false, length = 50)
	@NotBlank(message = "Nome do curso é obrigatório.")
	private String curso_nome;

	@ManyToOne
	@JoinColumn(name = "turma_id")
	@JsonIgnore
	private List<Turma> turmas;

	@ManyToOne
	@JoinColumn(name = "aluno_id")
	@JsonIgnore
	private Aluno alunos;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCurso_nome() {
		return curso_nome;
	}

	public void setCurso_nome(String curso_nome) {
		this.curso_nome = curso_nome;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	public Aluno getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno alunos) {
		this.alunos = alunos;
	}

}
