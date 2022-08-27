package br.com.dogCare.projetobt.service;

import java.util.ArrayList;

import br.com.dogCare.projetobt.model.Cliente;

public interface IClienteService {
	public Cliente criarNovo(Cliente novo);

	public Cliente atualizarDados(Cliente dados);

	public ArrayList<Cliente> buscarTodos();

	public Cliente buscarPeloId(Integer id);

	public void excluirCliente(Integer id);
}
