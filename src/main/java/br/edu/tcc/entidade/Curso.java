package br.edu.tcc.entidade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "curso")
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable = false, length = 50)
	@NotBlank(message = "Nome do curso é obrigatório.")
	private String curso_nome;

	@OneToMany(mappedBy = "curso", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<Turma> turmas;

	@ManyToOne
	@JoinColumn(name = "aluno_id")
	@JsonIgnore
	private Aluno alunos;

	@ManyToOne
	@JoinColumn(name = "aula_id")
	@JsonIgnore
	private Aula aula;

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

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

}
