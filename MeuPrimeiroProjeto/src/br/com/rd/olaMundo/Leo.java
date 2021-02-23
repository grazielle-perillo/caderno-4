package br.com.rd.olaMundo;

public class Leo {
	public static void main (String [] args) {
		int calculoNum1 = 6*(3+2);
		int numerador1 = (int) Math.pow(calculoNum1,2);
		int denominador1 = 3*2;
		int calculoFinal1 = numerador1/denominador1;
		
		int calculoNum2 = (1-5)*(2-7);
		int numerador2 = (int) Math.pow(calculoNum2,2);
		int denominador2 = (int) Math.pow(2,2);
		int calculoFinal2 = numerador2/denominador2;
		
		int subNumerador = calculoFinal1 - calculoFinal2;
		int calculoFinalNum =  (int) Math.pow(subNumerador,3);
		
		int denominador = (int) Math.pow (10,3);
		
		int resultado = calculoFinalNum/denominador;
		
		System.out.println (resultado);
		
		
		
		
		
		
		
	}

}
