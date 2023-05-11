package sistemaTraducaoCodGenetico;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static int menu() {
		Scanner leitura = new Scanner(System.in);
		System.out.println("0 - Inserir código\n1 - Listar ácidos cadastrado\n2 - Editar código\n3 - Excluir código\n4 - Eibir tabela\n5 - Fechar");
		Integer opcao = Integer.valueOf(leitura.nextLine());
		return opcao;
	}
	public static ArrayList<Gene> cadastrarAcido() {
		Scanner leitura = new Scanner(System.in);
		System.out.println("Tipo 1 - DNA para RNAm | 2 - RNAm para AA): ");
		Integer tipo = Integer.valueOf(leitura.nextLine());
		System.out.println("Nome: ");
		String nome = leitura.nextLine();
		System.out.println("Sequência: ");
		String sequencia = leitura.nextLine();
		ArrayList<Gene> genes = new ArrayList<>();
		Gene gene = new Gene();
		gene.setNome(nome);
		gene.setSequencia(sequencia);
		switch (tipo) {
		case 1: {
		}
		}
		
		
		
		return acidos;
	}
	
	public static void main(String[] args) {
		Integer opcao = null;
		Integer n = 0;
		while(opcao != 0) {
			opcao = menu();
			 switch (opcao) {
			 case 0: {
				 
			 }
			 case 5: {
				// Fecha o sistema
				 break;
			 }
			 }
		}
	}
}
