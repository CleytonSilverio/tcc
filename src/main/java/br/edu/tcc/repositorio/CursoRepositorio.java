package br.edu.tcc.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.tcc.entidade.Curso;

@Repository
public interface CursoRepositorio extends JpaRepository<Curso, Long>{

}
