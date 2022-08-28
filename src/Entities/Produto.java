package Entities;

public class Produto {
	
//	ATRIBUTOS
	private String nome;
	private Double preco;
	
//	CONSTRUTORES
	public Produto() {}

	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

//	GETTERS E SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
}
