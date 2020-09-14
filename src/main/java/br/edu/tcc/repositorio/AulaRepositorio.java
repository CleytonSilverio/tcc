package br.edu.tcc.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.tcc.entidade.Aula;

@Repository
public interface AulaRepositorio extends JpaRepository<Aula, Long>{
	
}
