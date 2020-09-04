package br.edu.tcc.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.tcc.entidade.Chamada;

@Repository
public interface ChamadaRepositorio extends JpaRepository<Long, Chamada>{

}
