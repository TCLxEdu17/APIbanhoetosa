package br.com.dogCare.projetobt.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.dogCare.projetobt.model.Animais;

public interface AnimalDAO extends CrudRepository<Animais, String>{
	

}
