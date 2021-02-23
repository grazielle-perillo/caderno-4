package br.com.rd.quartaturma.main;

import java.util.Scanner;

import br.com.rd.quartaturma.util.Retangulo;

public class Calculo {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		System.out.println(retangulo);
		
		System.out.println ("Digite a largura do retangulo:");
		double largura = sc.nextDouble();
		
		System.out.println ("Digite a altura do retangulo");
		double altura = sc.nextDouble();
		
		double area = retangulo.calcularArea(altura, largura);
		double perimetro = retangulo.calcularPerimetro(altura,largura);
		double diagonal = (retangulo.calcularDiagonal(altura,largura));
		
		System.out.println ("Area "+area);
		System.out.println ("Perimetro "+perimetro);
		System.out.printf ("Diagonal %.2f", diagonal);
		sc.close();
	}

}
