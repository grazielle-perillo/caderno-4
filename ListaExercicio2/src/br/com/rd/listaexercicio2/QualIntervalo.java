package br.com.rd.listaexercicio2;
import java.util.Scanner;

public class QualIntervalo {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("um valor");
		double valor = sc.nextDouble();
	
		int inter1 = 25;
		int inter2 = 50;
		int inter3 = 75;
		int inter4 = 100;
		
		if (valor<=inter1) {
			System.out.println ("O valor se encontra no interavalo entre: 0 e "+inter1);
		} else if (valor>inter1 && valor<=inter2) {
			System.out.println ("O valor se encontra no interavalo entre: "+inter1+" e "+inter2);
		} else if (valor>inter2 && valor<=inter3) {
			System.out.println ("O valor se encontra no interavalo : "+inter2+" e "+inter3);
		} else if (valor>inter3 && valor<=inter4) {
			System.out.println ("O valor se encontra no interavalo : "+inter3+" e "+inter4);
		} else {
			System.out.println ("Valor fora de intervalo");
		}
		sc.close();
	}
}