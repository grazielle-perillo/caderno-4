package br.com.rd.primeiralista;

import java.util.Scanner;

public class ConversaoCelsiusFahrenheit {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("informe a temperatura em Celsius que quer converte para Fahrenheit:");
		float celsius = sc.nextFloat();
		float conversao = (float) ((celsius *1.8)+32);
		System.out.println (celsius+" celsius = "+conversao+" Fahrenheit");
		sc.close();
	}
}
