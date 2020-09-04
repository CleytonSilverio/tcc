package br.edu.tcc.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.tcc.entidade.Calendario;

@Repository
public interface CalendarioRepositorio extends JpaRepository<Integer, Calendario>{

}
