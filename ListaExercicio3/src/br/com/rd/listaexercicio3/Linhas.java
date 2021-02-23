package br.com.rd.listaexercicio3;

import java.util.Scanner;

public class Linhas {
	public static void main (String [] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Digite um numero ");
		int numero = sc.nextInt();
			
		 for (int i = 1; i <= numero; i++) {
		    System.out.println (i+" "+ (int)Math.pow(i,2)+" "+(int)Math.pow(i,3));
		    }
		 sc.close();
		 }
}