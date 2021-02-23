package br.com.rd.quartaturma.util;

public class Retangulo {

	double area = 0;
	double perimetro = 0;
	double diagonal = 0;
	
	public double calcularArea (double largura, double altura) {
		area = altura*largura;
		return area;
	}

	public double calcularPerimetro (double altura, double largura) {
		perimetro = 2*(altura+largura);
		return perimetro;
	}
	
	public double calcularDiagonal (double altura, double largura) {
		diagonal = Math.sqrt(Math.pow(altura, 2)+Math.pow(largura,2));
		return diagonal;
	}
}