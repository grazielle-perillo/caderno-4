package br.com.rd.quartaturma.util;

public class Funcionario {
	String nomeFuncionario = " ";
	double salarioBruto = 0;
	double imposto = 0;
	double porcentagem = 0;
	
	
	public String lerDados (String nomeFuncionario, double salarioBruto,double imposto) {
		 return "Nome: "+nomeFuncionario+".\nSalario Bruto: R$"+salarioBruto+".\nImposto: "+imposto;
	}
	
	public double calcularSalarioLiq (double salarioBruto, double imposto) {
		double salarioLiquido = salarioBruto-imposto;
		return salarioLiquido ;
	}

	public double AumentarSalario(double salarioBruto, double porcentagem) {
		salarioBruto = (salarioBruto + ((salarioBruto/100)*porcentagem));
		return  salarioBruto;
		}
}