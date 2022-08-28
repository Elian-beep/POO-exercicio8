package app;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import Entites.Cliente;
import Entites.EncomendaItem;
import Entities.Encomenda;
import Entities.Produto;
import Entities.Enum.EncomendaStatus;

public class Programa {

	public static void main(String[] args) throws ParseException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("ENTRE COM OS DADOS DO CLIENTE:");
		System.out.printf("Nome: ");
		String nome = sc.nextLine();
		System.out.printf("Email: ");
		String email = sc.nextLine();
		System.out.printf("Data de aniversário (DD/MM/YYYY): ");
		Date dataAniversario = sdf.parse(sc.next());
		Cliente cliente = new Cliente(nome, email, dataAniversario);
		
//		System.out.println(cliente);
		
		System.out.println("ENTRE COM OS OUTROS DADOS:");
		System.out.printf("Status: ");
		EncomendaStatus status = EncomendaStatus.valueOf(sc.next());
		
		Encomenda encomenda = new Encomenda(new Date(), status, cliente);
		
		System.out.println("Quantidade de itens na encomenda: ");
		int n = sc.nextInt();
		Array ordem[];
		sc.nextLine();
		for(int i=1; i<=n; i++) {
			System.out.println("Entre com os dados do item #"+i);
			
			System.out.printf("Nome do produto: ");
			String nomeItem = sc.nextLine();
			System.out.printf("Preço do produto: ");
			Double precoItem = sc.nextDouble();
			
			Produto produto = new Produto(nomeItem, precoItem);
			
			System.out.printf("Quantidade: ");
			int quantidade = sc.nextInt();
			sc.nextLine();
			
			EncomendaItem encomendaItem = new EncomendaItem(quantidade, precoItem, produto);
			encomenda.adicionarItem(encomendaItem);			
		}
		
		System.out.println();
		System.out.println("RESUMO DA ENCOMENDA");
		System.out.println(encomenda);
		
		sc.close();
	}

}
