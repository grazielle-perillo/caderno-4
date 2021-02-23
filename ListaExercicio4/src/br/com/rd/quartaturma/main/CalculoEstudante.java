package br.com.rd.quartaturma.main;

import java.util.Scanner;

import br.com.rd.quartaturma.util.Estudante;

public class CalculoEstudante {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		Estudante estudante = new Estudante();	
		System.out.println(estudante);
		
		System.out.println ("Digite o nome do Estudante:");
		String nomeEstudante = sc.next();
		
		System.out.println ("Digite a nota primeiro trimestre");
		double nota1 = sc.nextDouble();
		while (nota1<0||nota1>30) {
			System.out.println ("opção inválida, Digite a nota primeiro trimestre");
			nota1 = sc.nextInt();
		}
		
		System.out.println ("Digite a nota segundo trimestre");
		double nota2 = sc.nextDouble();
		while (nota2<0||nota2>35) {
			System.out.println ("opção inválida, Digite a nota segundo trimestre");
			nota2 = sc.nextInt();
		}
		
		
		System.out.println ("Digite a nota terceiro trimestre");
		double nota3 = sc.nextDouble();
		while (nota3<0||nota3>35) {
			System.out.println ("opção inválida, Digite a nota terceiro trimestre");
			nota3 = sc.nextInt();
		}
		
		double notaTotal = Estudante.calcularNota(nota1,nota2,nota3);
		String aprovacao = Estudante.verificarAprovacao(nota1,nota2,nota3);
		double pontosRestantes = Estudante.calcularPontos(nota1,nota2,nota3);
		
		System.out.println ("Aluno:"+nomeEstudante+"\n Nota primeiro trimestre:"+nota1+"\n Nota segundo trimestre:"+nota2+"\n Nota terceiro trimestre:"+nota3);
		System.out.println (" Nota final:"+notaTotal);
		System.out.println (" Status:"+aprovacao);
		
		if (aprovacao.equals("FAILED")) {
		System.out.printf ("Faltam "+pontosRestantes+" pontos para o aluno ser aprovado.");
		}
		
		sc.close();
	}
}
