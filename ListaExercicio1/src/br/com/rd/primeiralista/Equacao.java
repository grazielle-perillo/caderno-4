package br.com.rd.primeiralista;

public class Equacao {
	public static void main (String [] args) {
	int a = 1;
	int b = 12;
	int c = -13;
	
	int delta = (int) Math.pow(b,2)- (4 * a * c);
	float raizDelta = (float) Math.sqrt(delta);
	float x1 = (-b + raizDelta)/(2*a);
	float x2 = (-b - raizDelta)/(2*a);
	String resultado = (delta<=0) ? ("não é possivel calcular pois não existem raizes quadradas de numero negativo") : (x1==x2) ? ("O calculo resultou em duas raizes iguais que valem: x1="+x1+" x2="+x2+". Delta vale= "+delta) : ("O calculo resultou em duas raizes diferentes que valem  x1="+x1+" x2="+x2+". Delta vale= "+delta) ;
	System.out.println (resultado);
	}
}
