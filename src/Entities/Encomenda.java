package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entites.Cliente;
import Entites.EncomendaItem;
import Entities.Enum.EncomendaStatus;

public class Encomenda {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
//	ATRIBUTOS
	private Date momento;
	private EncomendaStatus status;
	private Cliente cliente;
	private List<EncomendaItem> encomendasItens = new ArrayList<>();
	
//	CONSTRUTORES
	public Encomenda() {}

	public Encomenda(Date momento, EncomendaStatus status, Cliente cliente) {
		super();
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

//	GETTERS E SETTERS
	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<EncomendaItem> getEncomendasItens() {
		return encomendasItens;
	}

	public void setEncomendasItens(List<EncomendaItem> encomendasItens) {
		this.encomendasItens = encomendasItens;
	}

	public EncomendaStatus getStatus() {
		return status;
	}
	
//	MÉTODOS
	public void adicionarItem(EncomendaItem encomendaItem) {
		encomendasItens.add(encomendaItem);
	}
	
	public void removerItem(EncomendaItem encomendaItem) {
		encomendasItens.remove(encomendaItem);
	}
	
	public Double total() {
		double sum = 0.0;
		for (EncomendaItem encomendaItem : encomendasItens) {
			sum += encomendaItem.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (EncomendaItem encomendaItem : encomendasItens) {
			sb.append(encomendaItem+"\n");
		}
		
		return 
				"Momento: "+sdf.format(momento)+
				"\nStatus: "+status+
				"\nCliente: "+cliente+
				"\nItens na encomenda:\n"+sb.toString()+
				"\nTotal dos itens: "+String.format("%.2f", total())+"\n";
	}
	
}
