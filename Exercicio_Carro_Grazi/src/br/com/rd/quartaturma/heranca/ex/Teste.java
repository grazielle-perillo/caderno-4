package br.com.rd.quartaturma.heranca.ex;

public class Teste {
	public static void main(String[] args) {
		Civic Civic = new Civic(100,10);
		Ferrari Ferrari = new Ferrari(100,15);

	System.out.println ("Acelando Civic");
	Civic.mostrarDados("acelerar");
	System.out.println ("Freando Civic");
	Civic.mostrarDados("frear");
	
	System.out.println ("Acelando Ferrari");
	Ferrari.mostrarDados("acelerar");
	System.out.println ("Freando Ferrari");
	Ferrari.mostrarDados("frear");
	}
}