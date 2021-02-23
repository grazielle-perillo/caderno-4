package br.com.rd.listaexercicio2;
import java.util.Scanner;

public class HoraJogo {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Informe a hora inicial do jogo:");
		int inicio = sc.nextInt();
		
		System.out.println ("Informe a hora final do jogo:");
		int termino = sc.nextInt();
		
		if (termino>inicio) {
			int duracao = termino-inicio;
			System.out.println ("O jogo durou "+duracao);
		} else {
			int duracao = (termino+24)-inicio;
			System.out.println ("O jogo durou "+duracao+" horas.");
		}
		sc.close();
	}
}
	
