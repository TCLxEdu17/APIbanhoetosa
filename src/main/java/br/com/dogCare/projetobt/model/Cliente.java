
package br.com.dogCare.projetobt.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Column(name = "id_cliente")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_cliente;

	@Column(name = "nome", length = 45, nullable = false)
	private String nome;

	@Column(name = "telefone", length = 45, nullable = true)
	private String telefone;

	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("cliente")
	private List<Animais> listaAnimais;

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}

	public List<Animais> getListaAnimais() {
		return listaAnimais;
	}

	public void setListaAnimais(List<Animais> listaAnimais) {
		this.listaAnimais = listaAnimais;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
