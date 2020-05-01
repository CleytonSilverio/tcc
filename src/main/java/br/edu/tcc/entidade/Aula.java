package br.edu.tcc.entidade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Aula {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idAula;

	@OneToMany(mappedBy = "aluno", cascade = CascadeType.REMOVE)
	private List<Aluno> alunos;

	@OneToMany(mappedBy = "curso", cascade = CascadeType.REMOVE)
	private List<Curso> cursos;

	public long getIdAula() {
		return idAula;
	}

	public void setIdAula(long idAula) {
		this.idAula = idAula;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

}
