package br.com.dogCare.projetobt.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dogCare.projetobt.dao.ClienteDAO;
import br.com.dogCare.projetobt.model.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired
	private ClienteDAO dao;

	@Override
	public Cliente criarNovo(Cliente novo) {
		// TODO Auto-generated method stub
		if (novo.getNome()!= null) {
			return dao.save(novo);
		}
		return null;
	}

	@Override
	public Cliente atualizarDados(Cliente dados) {
		if(dados.getId_cliente() != null && dados.getNome() != null) {
			return dao.save(dados);
			
		}
		return null;
	}

	@Override
	public ArrayList<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		return (ArrayList<Cliente>)dao.findAll();
	}

	@Override
	public Cliente buscarPeloId(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).orElse(null);
	}

	@Override
	public void excluirCliente(Integer id) {
		dao.deleteById(id);
		
	}

}
