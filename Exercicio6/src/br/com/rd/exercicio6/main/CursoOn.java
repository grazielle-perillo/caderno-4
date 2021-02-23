package br.com.rd.exercicio6.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.rd.exercicio6.util.Usuario;

public class CursoOn {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Usuario> alunosA = new ArrayList<>();
		
		System.out.println ("Quantidade de alunos para matricular no curso A");
		int qAlunosA = sc.nextInt();
		
		for (int a = 0; a < qAlunosA; a++) {
			System.out.println("Informe o nome do aluno"+(a+1));
			System.out.println("Informe o codigo do aluno"+(a+1));
			alunosA.add(new Usuario(sc.next(), sc.next()));
		}
		
		List<Usuario> alunosB = new ArrayList<>();
		
		System.out.println ("Quantidade de alunos para matricular no curso B");
		int qAlunosB = sc.nextInt();
		
		for (int b = 0; b < qAlunosB; b++) {
			System.out.println("Informe o nome do aluno"+(b+1));
			System.out.println("Informe o codigo do aluno"+(b+1));
			alunosB.add(new Usuario(sc.next(), sc.next()));
		}
		
		List<Usuario> alunosC = new ArrayList<>();
		
		System.out.println ("Quantidade de alunos para matricular no curso C");
		int qAlunosC = sc.nextInt();
		
		for (int c = 0; c < qAlunosC; c++) {
			System.out.println("Informe o nome do aluno"+(c+1));
			System.out.println("Informe o codigo do aluno"+(c+1));
			alunosC.add(new Usuario(sc.next(), sc.next()));
		}
		
		alunosA.addAll(alunosB);
		alunosA.addAll(alunosC);
		
		for (int d=0; d<alunosA.size(); d++) {
			for (int e=0; e<alunosA.size();e++) {
				if (alunosA.get(d).equals(alunosA.get(e))==true) {
					alunosA.remove(e);
				}
			}
		}		
		int totalAlunos = alunosA.size();
		System.out.println ("Total de alunos inscritos: "+totalAlunos);
		
		sc.close();
	}
}
