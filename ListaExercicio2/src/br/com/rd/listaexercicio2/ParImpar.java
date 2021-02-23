package br.com.rd.listaexercicio2;
import java.util.Scanner;

public class ParImpar {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("informe um valor inteiro:");
		int valor = sc.nextInt();
		
		if (valor%2==0) {
			System.out.println ("O numero informado é par");
		} else {
			System.out.println ("O numero informado é impar");
		}
		sc.close();
	}
}