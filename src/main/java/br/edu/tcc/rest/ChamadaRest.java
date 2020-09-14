package br.edu.tcc.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.tcc.dto.ChamadaDto;
import br.edu.tcc.repositorio.ChamadaRepositorio;

@RestController
@RequestMapping("/v1/chamada")
@CrossOrigin
public class ChamadaRest {
	
	@Autowired
	ChamadaRepositorio chamada;
	
	@GetMapping
	public ResponseEntity<List<ChamadaDto>> getChamada() {
		List<ChamadaDto> dto = ChamadaDto.converter(chamada.findAll());
		return ResponseEntity.ok(dto);
	}
	
	@GetMapping(path = {"/{id}"})
	public ResponseEntity buscarPorID(@PathVariable Long id){
	   return chamada.findById(id)
	           .map(record -> ResponseEntity.ok().body(record))
	           .orElse(ResponseEntity.notFound().build());
	}

}
