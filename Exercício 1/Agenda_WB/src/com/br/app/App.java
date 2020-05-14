package com.br.app;

import java.util.ArrayList;
import java.util.List;

import com.br.modelo.Agenda;
import com.br.modelo.Cliente;
import com.br.modelo.Pessoa;
import com.br.modelo.Telefone;
import com.br.negocio.Leitor;
import com.br.negocio.Menu;

public class App {

	public static void main(String[] args) {
		
		List<Pessoa> contatos = new ArrayList();
		Agenda agenda = new Agenda();
		Menu menu = new Menu();
		String opcao = "";
		Leitor leitor;
		int opcao_menu;
	
		boolean continuar = true;
		
		do {
			opcao_menu = menu.menuPrincipal();
			
			switch(opcao_menu) {
			case 0:
				menu.finalizarPrograma();
				continue;
			case 1:
				agenda.cadastraCliente();
				break;
				
			case 2:
				String nome = "", genero = "";
				int idade = 0;
				leitor = new Leitor();
				
				System.out.println("Informe o nome completo do cliente: ");
				nome = leitor.getTexto();
				leitor = new Leitor();
				
				System.out.println("Informe a idade do cliente: ");
				idade = leitor.getValor();
				leitor = new Leitor();
				
				System.out.println("Informe o genero:\n [1]Feminino\n[2]Masculino\n[3]N�o Bin�rio");
				opcao = leitor.getTexto();
				
				do {
				
				if(opcao.equals("1")) { /*Feminino*/
					genero = "Feminino";
					break;
				}
				if(opcao.equals("2")) { /*Masculino*/
					genero = "Masculino";
					break;
				}
				if(opcao.equals("3")) {
					genero = "N�o Bin�rio";
					break;
				}
				
				else {
					System.out.println("Selecione uma op��o v�lida");
					}
				
				}while(!opcao.equals("1") || !opcao.equals("2") || !opcao.equals("3"));
				
				agenda.removerCadastro(nome, idade, genero);
			
				break;
			
			case 3:
				nome = "";
				genero = "";
				idade = 0;
				leitor = new Leitor();
				
				System.out.println("Informe o nome completo do cliente: ");
				nome = leitor.getTexto();
				leitor = new Leitor();
				
				System.out.println("Informe a idade do cliente: ");
				idade = leitor.getValor();
				leitor = new Leitor();
				
				System.out.println("Informe o genero:\n [1]Feminino\n[2]Masculino\n[3]N�o Bin�rio");
				opcao = leitor.getTexto();
				
				do {
				
				if(opcao.equals("1")) { /*Feminino*/
					genero = "Feminino";
					break;
				}
				if(opcao.equals("2")) { /*Masculino*/
					genero = "Masculino";
					break;
				}
				if(opcao.equals("3")) {
					genero = "N�o Bin�rio";
					break;
				}
				
				else {
					System.out.println("Selecione uma op��o v�lida");
					}
				
				}while(!opcao.equals("1") || !opcao.equals("2") || !opcao.equals("3"));
				
				agenda.editarCliente(nome, idade, genero);
				break;
			
			case 4:
				agenda.imprimirClientes();
				break;
			
			case 5:
				agenda.geraRelatorios();
				break;
				
			case 6:
				agenda.gerarCSV();
				break;
			}
		
		}while(continuar);
		
		System.exit(0);
		
	}
}
