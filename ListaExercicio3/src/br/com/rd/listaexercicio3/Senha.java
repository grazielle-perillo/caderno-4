package br.com.rd.listaexercicio3;

import java.util.Scanner;

public class Senha {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Digite a senha:");
		short senha = sc.nextShort();
		
		if (senha == 2002) {
			System.out.println ("Acesso permitido");
		} else {
			while (senha!=2002) {
				System.out.println ("Senha Invalida digite a senha novamente:");
				senha = sc.nextShort();
			}
		}
		System.out.println ("Acesso permitido");	
		sc.close();
	}

}
