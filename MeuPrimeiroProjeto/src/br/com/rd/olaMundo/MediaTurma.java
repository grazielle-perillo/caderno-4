package br.com.rd.olaMundo;

import java.util.Scanner;

public class MediaTurma {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota = 0;
		int notaTotal = 0;
		int n = 0;
		
		while (nota != -1) {
			System.out.println ("Digite a nota:");
			nota = sc.nextInt();
			
			if(nota>0 && nota<10) {
			notaTotal += nota;
			n++;	
			}
		}
		int media = notaTotal/n;
		System.out.println ("Média da turma : "+media);
		sc.close();
	}
}

