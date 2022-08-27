package br.com.dogCare.projetobt.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dogCare.projetobt.model.Animais;
import br.com.dogCare.projetobt.service.IAnimaisService;

@RestController
public class AnimalController {
	
	@Autowired
	private IAnimaisService service;
	
	@GetMapping("/animais")
	public ArrayList<Animais> recuperarTodoMundo(){
		return service.recuperarTodos();
		
	}
	
	
	
	
	

}
