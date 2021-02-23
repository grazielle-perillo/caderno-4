package br.com.rd.olaMundo;

import java.util.Scanner;

public class Escaner {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("Digite um numero inteiro para A");
		int a = sc.nextInt();
		System.out.println ("Digite um numero inteiro para B");
		int b = sc.nextInt();
		System.out.println ("Digite um numero inteiro para C");
		int c = sc.nextInt();
		System.out.println ("Digite um numero inteiro para D");
		int d = sc.nextInt();
		int diferenca = (a*b-c*d);
		System.out.println ("a diferença é "+diferenca);
		sc.close();
	}
}
