package br.com.rd.primeiralista;

import java.util.Scanner;

public class QuadradoCubo {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("informe um valor:");
		double valor = sc.nextDouble();
		
		double quadrado = Math.pow(valor,2);
		double cubo = Math.pow(valor,3);
		
		System.out.println (valor+" ao quadrado é: "+quadrado);
		System.out.println (valor+" ao cubo é: "+cubo);
		sc.close();
	}
}
