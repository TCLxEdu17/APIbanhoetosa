package br.com.dogCare.projetobt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "animais")
public class Animais {

	@Id
	@Column(name = "nome", length = 50)
	private String nome;

	@Column(name = "idade")
	private Integer idade;

	@Column(name = "peso")
	private Double peso;
	
	@ManyToOne
	@JsonIgnoreProperties("listaAnimais")
	@JoinColumn(name = "clientes_id_cliente")
	private Cliente cliente;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	

}
