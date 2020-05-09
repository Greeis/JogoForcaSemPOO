package br.com.bootcamp.jogo;

import java.util.*;

public class Forca {
	public static void main(String[] args) {
		System.out.println("Bem vindo ao jogo");
		Scanner in = new Scanner (System.in);
		System.out.print("Qual a dificuldade do jogo?: F(Facil); N(Normal); D(Dificil)");
		String dificuldadeJogo = in.next();
		
		switch (dificuldadeJogo) {
		case "F":
			System.out.println(listaPalavraFacil());
			break;
		case "N":
			System.out.println(listaPalavraNormal());
			break;
		case "D":
			System.out.println(listaPalavraDificil());
			break;
		default:
			System.out.println("Nenhuma tecla valida.");
			break;
		}
	}
	
	public static String listaPalavraDificil() {
		String[] palavras = { "carambola", "lichia", "jatoba"};
		Random random = new Random();
		return palavras[random.nextInt(palavras.length-1)];
	}
	
	public static String listaPalavraNormal() {
		String[] palavras = { "abacaxi", "melancia", "melao"};
		Random random = new Random();
		return palavras[random.nextInt(palavras.length-1)];
	}
	
	public static String listaPalavraFacil() {
		String[] palavras = { "banana", "uva", "maca"};
		Random random = new Random();
		return palavras[random.nextInt(palavras.length-1)];
	}
}
