package com.br.negocio;

import com.br.modelo.Servico_e_Produtos;

public class Menu {
	
	Leitor leitor = new Leitor();
	int opcao = 0;
	
	// Fun��o: Menu Principal da Aplica��o
	public int menuPrincipal() {
		System.out.println("\n--------------AGENDA WB-------------\n");
		System.out.println("[1] Cadastrar Cliente");
		System.out.println("[2] Descadastrar Cliente");
		System.out.println("[3] Editar Cliente\n");
		System.out.println("[4] Listar Clientes");
		System.out.println("[5] Relat�rios\n");
		System.out.println("[6] Guardar Informa��es em Arquivos CSV ");
		System.out.println("[0] SAIR");
		System.out.println("------------------------------------\n");

		System.out.println("\nInforme sua opcao: ");
		
		return leitor.getValor();
	}
	
	public int menuClientes() {
		System.out.println("\n------------ LISTA DE CLIENTES -------------\n");
		System.out.println("[1] Listar Informa��es Detalhadas");
		System.out.println("[2] Listar Apenas os Nomes");
		System.out.println("[3] Listar Clientes do Genero Feminino");
		System.out.println("[4] Listar Clientes do Genero Masculino");
		System.out.println("[5] Listar Clientes de Genero N�o Bin�rio\n");
		System.out.println("[0] VOLTAR");
		System.out.println("------------------------------------\n");
		
		
		System.out.println("\nInforme sua op��o: ");
		
		return leitor.getValor();
	}
	
	public int menuInfoCliente() {
		System.out.println("\n-------- ATUALIZAR DADOS ---------");
		System.out.println("[1] Alterar nome");
		System.out.println("[2] Alterar dataNascimento");
		System.out.println("[3] Alterar genero");
		System.out.println("[4] Alterar Telefone\n");
		System.out.println("[0] CANCELAR");
		System.out.println("------------------------------------\n");
		
		System.out.println("\nInforme sua op��o: ");
		
		return leitor.getValor();
	}
	
	public int menuServicos() {
		System.out.println("\n------------ LISTA DE SERVICOS ------------\n");
		System.out.println("[1] Servi�os Femininos");
		System.out.println("[2] Servicos Masculinos");
		System.out.println("[3] Servicos Est�ticos\n");
		System.out.println("[0] VOLTAR");
		
		System.out.println("\nInforme sua op��o: ");
		
		return leitor.getValor();
	}
	
	public int menuRelatorios() {
		System.out.println("\n------------ RELAT�RIOS -----------------\n");
		System.out.println("-------------- GERAL ---------------");
		System.out.println("[1] M�dia de Idade do P�blico em Geral");
		System.out.println("[2] M�dia de Idade do P�blico Feminino");
		System.out.println("[3] M�dia de Idade do P�blico Masculino");
		System.out.println("[4] M�dia de Idade do P�blico N�o Bin�rio\n");
		System.out.println("----------- PRODUTOS E SERVI�OS --------");
		System.out.println("[5] Produtos e Servi�os mais vendido no M�s");
		System.out.println("[6] Produtos e Servi�os mais vendidos no p�blico Feminino");
		System.out.println("[7] Produtos e Servi�os mais vendidos no p�blico Masculino");
		System.out.println("[8] Produtos e Servi�os mais vendidos no p�blico N�o Bin�rio\n");
		System.out.println("[0] VOLTAR");
		
		System.out.println("\nInforme sua op��o: ");
		
		return leitor.getValor();
	}
	
	public int menuCSV() {
		System.out.println("----------------EXPORTAR ARQUIVOS----------------\n");
		System.out.println("[1] Exportar Informa��es de Clientes");
		System.out.println("[2] Exportar Informa��es de Produtos\n");
		System.out.println("[0] VOLTAR");
		
		System.out.println("\nInforme sua op��o: ");
		
		return leitor.getValor();
	}
	
	//--------------------------------------------------------------
	
	/* Op��o Sair do Programa */
	public void finalizarPrograma() {
		System.out.println("\n\n------------------------------------\n");
		System.out.println("Voce escolheu fechar o programa\nTem certeza?");
		System.out.println("[1] Sim\n[2] N�o");
		System.out.println("------------------------------------\n");
		
		int opcao = leitor.getValor();
		
		if(opcao == 1) {
			System.out.println("\n------------------------------------\n");
			System.out.println("PROGRAMA ENCERRADO");
			System.out.println("\n------------------------------------\n");
			System.exit(0);
		}
	}
}
