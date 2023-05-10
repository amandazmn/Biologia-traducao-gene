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
	public static ArrayList<Acido> cadastrarAcido() {
		Scanner leitura = new Scanner(System.in);
		System.out.println("Tipo (DNA para RNAm | RNAm para AA): ");
		String tipo = leitura.nextLine();
		System.out.println("Nome: ");
		String nome = leitura.nextLine();
		System.out.println("Codigo: ");
		String codigo = leitura.nextLine();
		
		ArrayList<Acido> acidos = new ArrayList<>();
		Acido acid = new Acido();
		acid.setTipo(tipo);
		acid.setNome(nome);
		acid.setCodigo(codigo);
	
		
		return acidos;
	}
	public static ArrayList<Acido> traducao(ArrayList<A>)
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
