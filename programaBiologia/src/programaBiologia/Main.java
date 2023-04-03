package programaBiologia;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static Integer menu() {
		Scanner leitura = new Scanner(System.in);
		System.out.println("Como os aminoácidos serão exibidos?\n1 - Nome\n2 - Símbolo\n3 - Abreviação");
		String menuStr = leitura.nextLine();
		Integer menu = Integer.valueOf(menuStr);
		return menu;
	}
	
	public static String recebeCod() {
//		System.out.println("\nrecbeCod inicio");
		Scanner leitura = new Scanner(System.in);
		System.out.println("Insira um código de DNA: \n");
		String cod = leitura.nextLine();
		cod = cod.replaceAll(" ", "");
		cod = cod.toLowerCase();
		cod = cod.replaceAll("b", "");
		cod = cod.replaceAll("d", "");
		cod = cod.replaceAll("e", "");
		cod = cod.replaceAll("f", "");
		cod = cod.replaceAll("h", "");
		cod = cod.replaceAll("i", "");
		cod = cod.replaceAll("j", "");
		cod = cod.replaceAll("k", "");
		cod = cod.replaceAll("l", "");
		cod = cod.replaceAll("m", "");
		cod = cod.replaceAll("n", "");
		cod = cod.replaceAll("o", "");
		cod = cod.replaceAll("p", "");
		cod = cod.replaceAll("q", "");
		cod = cod.replaceAll("r", "");
		cod = cod.replaceAll("s", "");
		cod = cod.replaceAll("u", "");
		cod = cod.replaceAll("v", "");
		cod = cod.replaceAll("w", "");
		cod = cod.replaceAll("x", "");
		cod = cod.replaceAll("y", "");
		cod = cod.replaceAll("z", "");
//		System.out.println(cod);
//		System.out.println("\nrecbeCod fim");
		return cod;
	}

	public static ArrayList<String> separaCod(String cod) {
//		System.out.println("\nseparaCod inicio");
		ArrayList<String> codons = new ArrayList<String>();
		for (int i = 0; i < cod.length(); i+=3) {
			codons.add(cod.substring(i, Math.min(i + 3,cod.length())));
		}
//		System.out.println(codons);
//		System.out.println("\nseparaCod fim");
		return codons;
		
	}
	
	public static ArrayList<String> transcricaoNome(ArrayList<String> codons){
//		System.out.println("\ntranscricaoNome inicio");
		ArrayList<String> ami = new ArrayList<String>();
		String aminoacidos = new String();
		ami.add(null);
		for (int i = 0; i < codons.size(); i++) {
			aminoacidos = codons.get(i);
			aminoacidos = aminoacidos.replaceAll("tac", "Metionina");
			aminoacidos = aminoacidos.replaceAll("aag", "Fenilalanina");
			aminoacidos = aminoacidos.replaceAll("aaa", "Fenilalanina");
			aminoacidos = aminoacidos.replaceAll("aac", "Leucina");
			aminoacidos = aminoacidos.replaceAll("aat", "Leucina");
			aminoacidos = aminoacidos.replaceAll("gaa", "Leucina");
			aminoacidos = aminoacidos.replaceAll("gag", "Leucina");
			aminoacidos = aminoacidos.replaceAll("gat", "Leucina");
			aminoacidos = aminoacidos.replaceAll("gac", "Leucina");
			aminoacidos = aminoacidos.replaceAll("taa", "Isoleucina");
			aminoacidos = aminoacidos.replaceAll("tag", "Isoleucina");
			aminoacidos = aminoacidos.replaceAll("tat", "Isoleucina");
			aminoacidos = aminoacidos.replaceAll("caa", "Valina");
			aminoacidos = aminoacidos.replaceAll("cag", "Valina");
			aminoacidos = aminoacidos.replaceAll("cat", "Valina");
			aminoacidos = aminoacidos.replaceAll("cac", "Valina");
			aminoacidos = aminoacidos.replaceAll("aga", "Serina");
			aminoacidos = aminoacidos.replaceAll("agt", "Serina");
			aminoacidos = aminoacidos.replaceAll("att", "Stop");
			aminoacidos = aminoacidos.replaceAll("atc", "Stop");
			aminoacidos = aminoacidos.replaceAll("gta", "Histidina");
			aminoacidos = aminoacidos.replaceAll("gtg", "Histidina");
			aminoacidos = aminoacidos.replaceAll("gtt", "Glutamina");
			aminoacidos = aminoacidos.replaceAll("gtc", "Glutamina");
			aminoacidos = aminoacidos.replaceAll("tta", "Asparagina");
			aminoacidos = aminoacidos.replaceAll("ttg", "Asparagina");
			aminoacidos = aminoacidos.replaceAll("ttt", "Lisina");
			aminoacidos = aminoacidos.replaceAll("ttc", "Lisina");
			aminoacidos = aminoacidos.replaceAll("cta", "Aspartato");
			aminoacidos = aminoacidos.replaceAll("ctg", "Aspartato");
			aminoacidos = aminoacidos.replaceAll("ctt", "Glutamato");
			aminoacidos = aminoacidos.replaceAll("ctc", "Glutamato");
			aminoacidos = aminoacidos.replaceAll("aca", "Cisteina");
			aminoacidos = aminoacidos.replaceAll("acg", "Cisteina");
			aminoacidos = aminoacidos.replaceAll("act", "Stop");
			aminoacidos = aminoacidos.replaceAll("acc", "Triptofano");
			aminoacidos = aminoacidos.replaceAll("gca", "Arginina");
			aminoacidos = aminoacidos.replaceAll("gcg", "Arginina");
			aminoacidos = aminoacidos.replaceAll("gct", "Arginina");
			aminoacidos = aminoacidos.replaceAll("gcc", "Arginina");
			aminoacidos = aminoacidos.replaceAll("tca", "Serina");
			aminoacidos = aminoacidos.replaceAll("tcg", "Serina");
			aminoacidos = aminoacidos.replaceAll("tct", "Arginina");
			aminoacidos = aminoacidos.replaceAll("tcc", "Arginina");
			aminoacidos = aminoacidos.replaceAll("cca", "Glicina");
			aminoacidos = aminoacidos.replaceAll("ccg", "Glicina");
			aminoacidos = aminoacidos.replaceAll("cct", "Glicina");
			aminoacidos = aminoacidos.replaceAll("ccc", "Glicina");
			aminoacidos = aminoacidos.replaceAll("agg", "Serina");
			aminoacidos = aminoacidos.replaceAll("agc", "Serina");
			aminoacidos = aminoacidos.replaceAll("gga", "Prolina");
			aminoacidos = aminoacidos.replaceAll("ggg", "Prolina");
			aminoacidos = aminoacidos.replaceAll("ggt", "Prolina");
			aminoacidos = aminoacidos.replaceAll("ggc", "Prolina");
			aminoacidos = aminoacidos.replaceAll("tga", "Treonina");
			aminoacidos = aminoacidos.replaceAll("tgg", "Treonina");
			aminoacidos = aminoacidos.replaceAll("tgt", "Treonina");
			aminoacidos = aminoacidos.replaceAll("tgc", "Treonina");
			aminoacidos = aminoacidos.replaceAll("cga", "Alanina");
			aminoacidos = aminoacidos.replaceAll("cgg", "Alanina");
			aminoacidos = aminoacidos.replaceAll("cgt", "Alanina");
			aminoacidos = aminoacidos.replaceAll("cgc", "Alanina");
			aminoacidos = aminoacidos.replaceAll("ata", "Tirosina");
			aminoacidos = aminoacidos.replaceAll("atg", "Tirosina");
			ami.add(aminoacidos);
		}
//		System.out.println(ami);
//		System.out.println("\ntranscrissaoNome fim");
		return ami;
	}
	
	public static ArrayList<String> transcricaoSimbolo(ArrayList<String> codons){
//		System.out.println("\ntranscricaoSimbolo inicio");
		ArrayList<String> ami = new ArrayList<String>();
		String aminoacidos = new String();
		ami.add(null);
		for (int i = 0; i < codons.size(); i++) {
			aminoacidos = codons.get(i);
			aminoacidos = aminoacidos.replaceAll("tac", "Met");
			aminoacidos = aminoacidos.replaceAll("aag", "Phe");
			aminoacidos = aminoacidos.replaceAll("aaa", "Phe");
			aminoacidos = aminoacidos.replaceAll("aac", "Leu");
			aminoacidos = aminoacidos.replaceAll("aat", "Leu");
			aminoacidos = aminoacidos.replaceAll("gaa", "Leu");
			aminoacidos = aminoacidos.replaceAll("gag", "Leu");
			aminoacidos = aminoacidos.replaceAll("gat", "Leu");
			aminoacidos = aminoacidos.replaceAll("gac", "Leu");
			aminoacidos = aminoacidos.replaceAll("taa", "Ile");
			aminoacidos = aminoacidos.replaceAll("tag", "Ile");
			aminoacidos = aminoacidos.replaceAll("tat", "Ile");
			aminoacidos = aminoacidos.replaceAll("caa", "Val");
			aminoacidos = aminoacidos.replaceAll("cag", "Val");
			aminoacidos = aminoacidos.replaceAll("cat", "Val");
			aminoacidos = aminoacidos.replaceAll("cac", "Val");
			aminoacidos = aminoacidos.replaceAll("aga", "Ser");
			aminoacidos = aminoacidos.replaceAll("agt", "Ser");
			aminoacidos = aminoacidos.replaceAll("att", "Stop");
			aminoacidos = aminoacidos.replaceAll("atc", "Stop");
			aminoacidos = aminoacidos.replaceAll("gta", "His");
			aminoacidos = aminoacidos.replaceAll("gtg", "His");
			aminoacidos = aminoacidos.replaceAll("gtt", "Gln");
			aminoacidos = aminoacidos.replaceAll("gtc", "Gln");
			aminoacidos = aminoacidos.replaceAll("tta", "Asn");
			aminoacidos = aminoacidos.replaceAll("ttg", "Asn");
			aminoacidos = aminoacidos.replaceAll("ttt", "Lys");
			aminoacidos = aminoacidos.replaceAll("ttc", "Lys");
			aminoacidos = aminoacidos.replaceAll("cta", "Asp");
			aminoacidos = aminoacidos.replaceAll("ctg", "Asp");
			aminoacidos = aminoacidos.replaceAll("ctt", "Glu");
			aminoacidos = aminoacidos.replaceAll("ctc", "Glu");
			aminoacidos = aminoacidos.replaceAll("aca", "Cys");
			aminoacidos = aminoacidos.replaceAll("acg", "Cys");
			aminoacidos = aminoacidos.replaceAll("act", "Stop");
			aminoacidos = aminoacidos.replaceAll("acc", "Trp");
			aminoacidos = aminoacidos.replaceAll("gca", "Arg");
			aminoacidos = aminoacidos.replaceAll("gcg", "Arg");
			aminoacidos = aminoacidos.replaceAll("gct", "Arg");
			aminoacidos = aminoacidos.replaceAll("gcc", "Arg");
			aminoacidos = aminoacidos.replaceAll("tca", "Ser");
			aminoacidos = aminoacidos.replaceAll("tcg", "Ser");
			aminoacidos = aminoacidos.replaceAll("tct", "Arg");
			aminoacidos = aminoacidos.replaceAll("tcc", "Arg");
			aminoacidos = aminoacidos.replaceAll("cca", "Gly");
			aminoacidos = aminoacidos.replaceAll("ccg", "Gly");
			aminoacidos = aminoacidos.replaceAll("cct", "Gly");
			aminoacidos = aminoacidos.replaceAll("ccc", "Gly");
			aminoacidos = aminoacidos.replaceAll("agg", "Ser");
			aminoacidos = aminoacidos.replaceAll("agc", "Ser");
			aminoacidos = aminoacidos.replaceAll("gga", "Pro");
			aminoacidos = aminoacidos.replaceAll("ggg", "Pro");
			aminoacidos = aminoacidos.replaceAll("ggt", "Pro");
			aminoacidos = aminoacidos.replaceAll("ggc", "Pro");
			aminoacidos = aminoacidos.replaceAll("tga", "Thr");
			aminoacidos = aminoacidos.replaceAll("tgg", "Thr");
			aminoacidos = aminoacidos.replaceAll("tgt", "Thr");
			aminoacidos = aminoacidos.replaceAll("tgc", "Thr");
			aminoacidos = aminoacidos.replaceAll("cga", "Ala");
			aminoacidos = aminoacidos.replaceAll("cgg", "Ala");
			aminoacidos = aminoacidos.replaceAll("cgt", "Ala");
			aminoacidos = aminoacidos.replaceAll("cgc", "Ala");
			aminoacidos = aminoacidos.replaceAll("ata", "Tyr");
			aminoacidos = aminoacidos.replaceAll("atg", "Tyr");
			ami.add(aminoacidos);
		}
//		System.out.println(ami);
//		System.out.println("\ntranscrissaoSimbolo fim");
		return ami;
	}
	
	public static ArrayList<String> transcricaoAbreviacao(ArrayList<String> codons){
//		System.out.println("\ntranscricaoAbreviacao inicio");
		ArrayList<String> ami = new ArrayList<String>();
		String aminoacidos = new String();
		ami.add(null);
		for (int i = 0; i < codons.size(); i++) {
			aminoacidos = codons.get(i);
			aminoacidos = aminoacidos.replaceAll("tac", "M");
			aminoacidos = aminoacidos.replaceAll("aag", "F");
			aminoacidos = aminoacidos.replaceAll("aaa", "F");
			aminoacidos = aminoacidos.replaceAll("aac", "L");
			aminoacidos = aminoacidos.replaceAll("aat", "L");
			aminoacidos = aminoacidos.replaceAll("gaa", "L");
			aminoacidos = aminoacidos.replaceAll("gag", "L");
			aminoacidos = aminoacidos.replaceAll("gat", "L");
			aminoacidos = aminoacidos.replaceAll("gac", "L");
			aminoacidos = aminoacidos.replaceAll("taa", "I");
			aminoacidos = aminoacidos.replaceAll("tag", "I");
			aminoacidos = aminoacidos.replaceAll("tat", "I");
			aminoacidos = aminoacidos.replaceAll("caa", "V");
			aminoacidos = aminoacidos.replaceAll("cag", "V");
			aminoacidos = aminoacidos.replaceAll("cat", "V");
			aminoacidos = aminoacidos.replaceAll("cac", "V");
			aminoacidos = aminoacidos.replaceAll("aga", "S");
			aminoacidos = aminoacidos.replaceAll("agt", "S");
			aminoacidos = aminoacidos.replaceAll("att", "Stop");
			aminoacidos = aminoacidos.replaceAll("atc", "Stop");
			aminoacidos = aminoacidos.replaceAll("gta", "H");
			aminoacidos = aminoacidos.replaceAll("gtg", "H");
			aminoacidos = aminoacidos.replaceAll("gtt", "Q");
			aminoacidos = aminoacidos.replaceAll("gtc", "Q");
			aminoacidos = aminoacidos.replaceAll("tta", "N");
			aminoacidos = aminoacidos.replaceAll("ttg", "N");
			aminoacidos = aminoacidos.replaceAll("ttt", "K");
			aminoacidos = aminoacidos.replaceAll("ttc", "K");
			aminoacidos = aminoacidos.replaceAll("cta", "D");
			aminoacidos = aminoacidos.replaceAll("ctg", "D");
			aminoacidos = aminoacidos.replaceAll("ctt", "E");
			aminoacidos = aminoacidos.replaceAll("ctc", "E");
			aminoacidos = aminoacidos.replaceAll("aca", "C");
			aminoacidos = aminoacidos.replaceAll("acg", "C");
			aminoacidos = aminoacidos.replaceAll("act", "Stop");
			aminoacidos = aminoacidos.replaceAll("acc", "W");
			aminoacidos = aminoacidos.replaceAll("gca", "R");
			aminoacidos = aminoacidos.replaceAll("gcg", "R");
			aminoacidos = aminoacidos.replaceAll("gct", "R");
			aminoacidos = aminoacidos.replaceAll("gcc", "R");
			aminoacidos = aminoacidos.replaceAll("tca", "S");
			aminoacidos = aminoacidos.replaceAll("tcg", "S");
			aminoacidos = aminoacidos.replaceAll("tct", "R");
			aminoacidos = aminoacidos.replaceAll("tcc", "R");
			aminoacidos = aminoacidos.replaceAll("cca", "G");
			aminoacidos = aminoacidos.replaceAll("ccg", "G");
			aminoacidos = aminoacidos.replaceAll("cct", "G");
			aminoacidos = aminoacidos.replaceAll("ccc", "G");
			aminoacidos = aminoacidos.replaceAll("agg", "S");
			aminoacidos = aminoacidos.replaceAll("agc", "S");
			aminoacidos = aminoacidos.replaceAll("gga", "P");
			aminoacidos = aminoacidos.replaceAll("ggg", "P");
			aminoacidos = aminoacidos.replaceAll("ggt", "P");
			aminoacidos = aminoacidos.replaceAll("ggc", "P");
			aminoacidos = aminoacidos.replaceAll("tga", "T");
			aminoacidos = aminoacidos.replaceAll("tgg", "T");
			aminoacidos = aminoacidos.replaceAll("tgt", "T");
			aminoacidos = aminoacidos.replaceAll("tgc", "T");
			aminoacidos = aminoacidos.replaceAll("cga", "A");
			aminoacidos = aminoacidos.replaceAll("cgg", "A");
			aminoacidos = aminoacidos.replaceAll("cgt", "A");
			aminoacidos = aminoacidos.replaceAll("cgc", "A");
			aminoacidos = aminoacidos.replaceAll("ata", "Y");
			aminoacidos = aminoacidos.replaceAll("atg", "Y");
			ami.add(aminoacidos);
		}
//		System.out.println(ami);
//		System.out.println("\ntranscrissaoAbreviacao fim");
		return ami;
	}
	
	public static ArrayList<String> limpaAmi(ArrayList<String> ami){
//		System.out.println(ami);
//		System.out.println("\nlimpaAmi inicio");
		ami.remove(0);
		ArrayList<String> codigo = new ArrayList<String>();
		for(int i = 0; i < ami.size(); i++) {
			String aminoacido = ami.get(i);
			if(aminoacido.equals("Met")||aminoacido.equals("Metionina")||aminoacido.equals("M")) {
				for (int j = i; j < ami.size(); j++) {
					aminoacido = ami.get(j);
					if(aminoacido.equals("Stop")) {
						break;
					}
					codigo.add(aminoacido);
				}
			}
			if(aminoacido.equals("Stop")&&codigo.size()!=0) {
				break;
			}
		}
//		System.out.println(codigo);
//		System.out.println("\nlimpaAmi fim");
		return codigo;
	}
	
	public static void imprime(ArrayList<String> codigo) {
//		System.out.println("\nimprime inicio");
		for (String aminoacido : codigo) {
			System.out.print(aminoacido + " ");
		}
//		System.out.println(codigo);
//		System.out.println("\nimprime fim");
	}

	public static void main(String[] args) {
//		System.out.println("\nchamando menu");
		Integer menu = menu();
//		System.out.println("\nchamando recebeCod");
		String cod = recebeCod();
		ArrayList<String> codons = new ArrayList<String>();
//		System.out.println("\nchamando separaCod");
		codons = separaCod(cod);
		ArrayList<String> aminoacidos = new ArrayList<String>();
//		System.out.println("\nchamando trancrissao");
		if(menu.equals(1)) {
			aminoacidos = transcricaoNome(codons);
		}
		if(menu.equals(2)) {
			aminoacidos = transcricaoSimbolo(codons);
		}
		if(menu.equals(3)) {
			aminoacidos = transcricaoAbreviacao(codons);
		}
		ArrayList<String> codigo = new ArrayList<String>();
//		System.out.println("\nchamando limpaAmi");
		codigo = limpaAmi(aminoacidos);
//		System.out.println("\nchamando imprime");
		imprime(codigo);
	}

}
