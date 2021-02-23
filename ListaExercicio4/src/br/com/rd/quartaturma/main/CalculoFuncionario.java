package br.com.rd.quartaturma.main;

import java.util.Scanner;

import br.com.rd.quartaturma.util.Funcionario;

public class CalculoFuncionario {
public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		System.out.println(funcionario);
		
		System.out.println ("Digite o nome do funcionario:");
		String nomeFuncionario = sc.next();
		
		System.out.println ("Digite o valor do salario Bruto");
		double salarioBruto = sc.nextDouble();
		
		System.out.println ("Digite o valor do imposto");
		double imposto = sc.nextDouble();
		
		System.out.println ("Digite a porcentagem de reajuste salarial");
		double porcentagem = sc.nextDouble();
		
		String dados = funcionario.lerDados(nomeFuncionario, salarioBruto, imposto);
		double  salarioLiquido= funcionario.calcularSalarioLiq(salarioBruto, imposto);
		double aumento = funcionario.AumentarSalario(salarioBruto, porcentagem);
		
		System.out.println ("Dados Funcionario: \n"+dados+"\n");
		System.out.println ("Dados Salario Liquido: \nNome:"+ nomeFuncionario+"\nSalario liquido: R$"+salarioLiquido+"\n");
		System.out.println ("Dados Salario pós aumento: \nNome:"+ nomeFuncionario+"\nSalario Atual: R$"+aumento+"\n");
		sc.close();
	}

}
