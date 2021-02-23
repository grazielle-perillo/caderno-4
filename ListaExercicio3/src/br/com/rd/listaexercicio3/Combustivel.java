package br.com.rd.listaexercicio3;

import java.util.Scanner;

public class Combustivel {
	public static void main (String [] args) {

	Scanner sc = new Scanner(System.in);
	
	int alcool = 0;
	int gasolina = 0;
	int diesel = 0;
	
	while (true) {
		
	System.out.println ("Digite qual combustivel: 1.Álcool 2.Gasolina 3.Diesel 4.Fim");
	int preferencia = sc.nextInt();
		
		while (preferencia <1 || preferencia>4) {
			System.out.println ("opção inválida, digite qual combustivel: 1.Álcool 2.Gasolina 3.Diesel 4.Fim");
			preferencia = sc.nextInt();
		}
		if (preferencia==1) {
			alcool = alcool+1;
		} else if (preferencia==2) {
			gasolina = gasolina+1;
		} else if (preferencia==3) {
			diesel = diesel+1;
		} else {
			break;
		}
	}
	
	System.out.println ("MUITO OBRIGADO");
	System.out.println ("Alcool ="+alcool);
	System.out.println ("Gasolina ="+gasolina);
	System.out.println ("Diesel ="+diesel);
	sc.close();
	}
}
