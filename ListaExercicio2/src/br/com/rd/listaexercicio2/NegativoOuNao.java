package br.com.rd.listaexercicio2;
import java.util.Scanner;

public class NegativoOuNao {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("informe um valor inteiro:");
		int valor = sc.nextInt();
		
		if (valor<0) {
			System.out.println ("O numero informado é negativo");
		} else {
			System.out.println ("O numero informado é positivo");
		}
		sc.close();
	}
}