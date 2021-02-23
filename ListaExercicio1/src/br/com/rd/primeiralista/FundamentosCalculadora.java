package br.com.rd.primeiralista;

import java.util.Scanner;

public class FundamentosCalculadora {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("informe um valor");
		double a = sc.nextDouble();
		System.out.println ("informe mais um valor");
		double b = sc.nextDouble();
		System.out.println ("informe a operação que deseja realizar, digite um numero: 1.(+), 2.subtração(-), 3.(*), 4.(/), 5.(%)");
		int operacao = sc.nextInt();
		double conta = operacao==1 ? a+b : operacao==2 ? a-b : operacao==3 ? a*b : operacao==4 ? a/b : a%b;
		System.out.println ("O resultado da operação é = "+conta);
		sc.close();
	}	
}