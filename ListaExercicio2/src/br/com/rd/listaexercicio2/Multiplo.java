package br.com.rd.listaexercicio2;
import java.util.Scanner;

public class Multiplo {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("Informe um numero numero:");
		int a = sc.nextInt();
		System.out.println ("Informe mais um numero:");
		int b = sc.nextInt();
		
		if (a % b ==0||b % a == 0) {
			System.out.println ("São Multiplos.");
		} else {
			System.out.println ("Não são multiplos.");
		}
		sc.close();
	}
}
