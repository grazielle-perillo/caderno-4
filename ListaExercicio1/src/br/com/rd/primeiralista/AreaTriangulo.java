package br.com.rd.primeiralista;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("informe o valor da base do triangulo:");
		double base = sc.nextDouble();
		
		System.out.println ("informe o valor da altura do triangulo:");
		double altura =  sc.nextDouble();
		
		double area = (base*altura)/2;
		
		System.out.println ("A área do triangulo é :"+area);
		sc.close();
	}	
}

