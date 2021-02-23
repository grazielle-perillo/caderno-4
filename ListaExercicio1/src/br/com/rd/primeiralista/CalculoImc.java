package br.com.rd.primeiralista;

import java.util.Scanner;

public class CalculoImc {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("informe seu peso:");
		double peso = sc.nextDouble();
		
		System.out.println ("informe sua altura:");
		double altura =  Math.pow(sc.nextDouble(),2);
		double imc = peso/altura;
		System.out.println ("seu IMC é :"+imc);
		sc.close();
	}	
}
