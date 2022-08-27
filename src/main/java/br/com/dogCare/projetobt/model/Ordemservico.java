package br.com.dogCare.projetobt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ordemservico")
public class Ordemservico {
	
	@Id
	@Column(name = "valor")
	private Double valor;
	
	@Column(name = "hora_entrada", length = 45 )
	private String hora_entrada;
	
	@Column(name = "hora_retirada", length = 45)
	private String hora_retirada;
	
	@ManyToOne
	@JoinColumn(name = "clientes_id_cliente")
	private Cliente cliente;

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getHora_entrada() {
		return hora_entrada;
	}

	public void setHora_entrada(String hora_entrada) {
		this.hora_entrada = hora_entrada;
	}

	public String getHora_retirada() {
		return hora_retirada;
	}

	public void setHora_retirada(String hora_retirada) {
		this.hora_retirada = hora_retirada;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
}

