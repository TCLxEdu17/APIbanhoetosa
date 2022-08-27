package br.com.dogCare.projetobt.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dogCare.projetobt.dao.AnimalDAO;
import br.com.dogCare.projetobt.model.Animais;


@Service
public class AnimaisServiceImpl implements IAnimaisService {
	
	@Autowired
	private AnimalDAO dao;
	@Override
	public ArrayList<Animais> recuperarTodos() {
		// TODO Auto-generated method stub
		return (ArrayList<Animais>)dao.findAll();
	}

	@Override
	public Animais recuperarPeloNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Animais cadastrarNovo(Animais novo) {
		// TODO Auto-generated method stub
		return null;
	}

}
