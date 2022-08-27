package br.com.dogCare.projetobt.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dogCare.projetobt.dao.OrdemservicoDAO;
import br.com.dogCare.projetobt.model.Ordemservico;

@Service
public class OrdemservicoServiceImpl implements IOrdemservicoService {

	@Autowired
	private OrdemservicoDAO dao;
	@Override
	public ArrayList<Ordemservico> recuperarTodos() {
		// TODO Auto-generated method stub
		return(ArrayList<Ordemservico>)dao.findAll();
	}

	@Override
	public Ordemservico recuperarPeloValor(Double valor) {
		// TODO Auto-generated method stub
		return dao.findById(valor).orElse(null);
	}

	@Override
	public Ordemservico cadastrarNovo(Ordemservico novo) {
		// TODO Auto-generated method stub
		return dao.save(novo);
	}

}
