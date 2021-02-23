package br.com.rd.olaMundo;

import java.util.Scanner;

public class Array {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("Quantidade de notas que seram inseridas :");
		int qNotas = sc.nextInt();
		
		double [] notas = new double [qNotas];
		
		double total = 0;
		for (int a = 0; a < notas.length; a++) {
			System.out.println("Informe a nota"+(a+1));
			notas[a]= sc.nextDouble();
			total = total+notas[a];
		}
		double media = total/notas.length;
		System.out.println ("Media turma : "+ media);
		
		sc.close();
	}

}
