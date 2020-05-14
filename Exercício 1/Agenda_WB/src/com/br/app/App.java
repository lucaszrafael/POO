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
		
		agenda.cadastraCliente();
		
		agenda.imprimirClientes();
		
		//agenda.geraRelatorios();
		
		System.exit(0);
		
	}

}
