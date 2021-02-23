package br.com.rd.primeiralista;

import java.util.Scanner;

public class ConversaoFahrenheitCelsius {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("informe a temperatura em Fahrenheit que quer converte para Celsius:");
		float fahrenheit = sc.nextFloat();
		float conversao = (float) ((fahrenheit-32)/1.8);
		System.out.println (fahrenheit+" Fahrenheit = "+conversao+" Celsius");
		sc.close();
	}
}
