package Entites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
//	ATRIBUTOS
	private String nome;
	private String email;
	private Date dataAniversario;
	
//	CONSTRUTORES
	public Cliente() {}

	public Cliente(String nome, String email, Date dataAniversario) {
		super();
		this.nome = nome;
		this.email = email;
		this.dataAniversario = dataAniversario;
	}

//	GETTERS E SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Date dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	@Override
	public String toString() {
		return nome+" ("+ sdf.format(dataAniversario)+") - "+email;
	}
	
	
}
