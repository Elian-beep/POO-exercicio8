package Entites;

import Entities.Produto;

public class EncomendaItem {
	
//	ATRIBUTOS
	private Integer quantidade;
	private Double preco;
	private Produto produto;
	
//	CONSTRUTORES
	public EncomendaItem() {}

	public EncomendaItem(Integer quantidade, Double preco, Produto produto) {
		super();
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

//	GETTERS E SETTER
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

//	MÉTODOS
	@Override
	public String toString() {
		return produto.getNome()+", Quantidade: "+quantidade+", Subtotal: "+subTotal();
	}
	
	public Double subTotal() {
		return quantidade*preco;
	}
	
}
