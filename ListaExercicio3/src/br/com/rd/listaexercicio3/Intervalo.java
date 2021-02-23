package br.com.rd.listaexercicio3;

import java.util.Scanner;

public class Intervalo {
	public static void main (String [] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Digite um valor inteiro para a quantidade de numeros que deseja informar ");
		int valor = sc.nextInt();
		
		int in = 0;
		int out = 0;
			
		 for (int i = 1; i <= valor; i++) {
		    System.out.println ("Digite o numero"+i);
		    int numero  = sc.nextInt();
			
			if (numero >= 10 && numero<=20) {
				in = in+1;
			} else {
				out = out +1;
			}
		  }
		 
		System.out.println ("in = "+in);
		System.out.println ("out ="+out);
		sc.close();
		}
	}
