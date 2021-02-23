package br.com.rd.quartaturma.util;

public class Estudante {
	double nota1 = 0;
	double nota2 = 0;
	double nota3 = 0;
	
	public static double calcularNota (double nota1, double nota2, double nota3) {
		double notaTotal = nota1+nota2+nota3;
		return notaTotal;
	}
	
	public static  String verificarAprovacao (double nota1, double nota2, double nota3) {
		double notaTotal = nota1+nota2+nota3;
		int notaMinima = ((30+35+35)/100)*60;
		if (notaTotal>= notaMinima) {
			return "PASS";
		} else {
			return "FAILED";
		}
	}
	public static double calcularPontos(double nota1, double nota2, double nota3) {
		double notaTotal = nota1+nota2+nota3;
		int notaMinima = ((30+35+35)/100)*60;
		double pontos = notaMinima-notaTotal;
		return pontos;	
	}

}
