package br.edu.tcc.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.tcc.entidade.Aluno;

@Repository
public interface AlunoRepositorio extends JpaRepository<Aluno, Long> {

	@Override
	List<Aluno> findAll();
}
