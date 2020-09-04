package br.edu.tcc.entidade;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

@Entity
public class Calendario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idCalendario;
	
	@Column(nullable = false, length = 50)
	@NotBlank(message = "Data da aula é obrigatório!")
	private Date dia;
	
	@OneToMany(mappedBy = "curso", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private Curso curso;
	
	@OneToMany(mappedBy = "aula", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private Aula aula;

	public Integer getIdCalendario() {
		return idCalendario;
	}

	public void setIdCalendario(Integer idCalendario) {
		this.idCalendario = idCalendario;
	}

	public Date getDia() {
		return dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

}
