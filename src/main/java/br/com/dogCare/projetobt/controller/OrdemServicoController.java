package br.com.dogCare.projetobt.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dogCare.projetobt.model.Ordemservico;
import br.com.dogCare.projetobt.service.IOrdemservicoService;

@RestController
public class OrdemServicoController {
	
	@Autowired
	private IOrdemservicoService service;
	
	@GetMapping("/ordemservico")
	public ArrayList<Ordemservico> recuperartodoMundo(){
		return service.recuperarTodos();
	}
	
	
	

}
