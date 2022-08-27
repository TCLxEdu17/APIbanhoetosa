package br.com.dogCare.projetobt.service;

import java.util.ArrayList;

import br.com.dogCare.projetobt.model.Ordemservico;

public interface IOrdemservicoService {
	public ArrayList<Ordemservico> recuperarTodos();

	public Ordemservico recuperarPeloValor(Double valor);

	public Ordemservico cadastrarNovo(Ordemservico novo);

}
