package br.com.dogCare.projetobt.service;

import java.util.ArrayList;

import br.com.dogCare.projetobt.model.Animais;

public interface IAnimaisService {
	
	public ArrayList<Animais> recuperarTodos();
	public Animais recuperarPeloNome(String nome);
	public Animais cadastrarNovo(Animais novo);
	

}
