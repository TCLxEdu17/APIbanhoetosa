package br.com.dogCare.projetobt.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.dogCare.projetobt.model.Cliente;
import br.com.dogCare.projetobt.service.IClienteService;

@RestController
public class ClienteController {

	@Autowired
	private IClienteService service;

	@GetMapping("/clientes")
	public ArrayList<Cliente> recuperarTodos() {
		return service.buscarTodos();

	}

	@PostMapping("/clientes")
	public ResponseEntity<Cliente> incluirNovo(@RequestBody Cliente novo) {
		Cliente res = service.criarNovo(novo);
		if (res != null) {
			return ResponseEntity.ok(res);

		}
		return ResponseEntity.badRequest().build();
	}

	@PutMapping("/clientes")
	public ResponseEntity<Cliente> alterar(@RequestBody Cliente dados) {
		Cliente res = service.atualizarDados(dados);
		if (dados != null) {
			return ResponseEntity.ok(res);

		}
		return ResponseEntity.badRequest().build();
	}

	@DeleteMapping("/clientes/{id_cliente}")
	public ResponseEntity<Cliente> excluirCliente(@PathVariable Integer id_cliente) {
		service.excluirCliente(id_cliente);
		return ResponseEntity.ok(null);

	}

	@GetMapping("/clientes/{id_cliente}")
	public ResponseEntity<Cliente> buscarPeloId(@PathVariable Integer id_cliente) {
		Cliente res = service.buscarPeloId(id_cliente);
		if (res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.notFound().build();
	}
}
