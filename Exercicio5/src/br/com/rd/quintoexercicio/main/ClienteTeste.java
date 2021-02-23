package br.com.rd.quintoexercicio.main;

import java.util.Scanner;

import br.com.rd.quintoexercicio.util.Cliente;

public class ClienteTeste {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Cliente cliente1 = new Cliente();
		
		System.out.println ("Nome do cliente 1 :");
		cliente1.setNome(sc.nextLine());
		
		System.out.println (cliente1.getNome()+" digite o numero da conta");
		int numeroConta1 = sc.nextInt();
		cliente1.setConta(numeroConta1);
		
		System.out.println (cliente1.getNome()+" deseja realizar um deposito inicial? s – sim / n – não");
		String cond1 = sc.next();
		if (cond1.equals("s")) {
			System.out.println (cliente1.getNome()+" Quanto deseja depositar?");
			double primeiroDep1 =  sc.nextDouble();
			cliente1.setDepositar(primeiroDep1);
			cliente1.mostrarDados();
		} else {
		cliente1.mostrarDados();
		}
		
		while(true) {
		System.out.println ("\n"+cliente1.getNome()+" deseja realizar uma operação? Digite 1.deposito 2.saque 3.não");
		int operacao1 = sc.nextInt();
			if (operacao1==1) {
				double valorDep1 = cliente1.transacao(operacao1);
				System.out.printf("\nValor depositado: R$%.2f\n", valorDep1);
				cliente1.mostrarDados();
			} else if (operacao1==2){
				double valorSaq1 = cliente1.transacao(operacao1);
				System.out.printf("\nValor saque: R$%.2f\n", valorSaq1);
				cliente1.mostrarDados();
			}
			else {
				break;
			}
		}
		
		Cliente cliente2 = new Cliente();
		
		System.out.println ("Nome do cliente 2 :");
		cliente2.setNome(sc.next());
		
		System.out.println (cliente2.getNome()+" digite o numero da conta");
		int numeroConta2 = sc.nextInt();
		cliente2.setConta(numeroConta2);
		
		System.out.println (cliente2.getNome()+" deseja realizar um deposito inicial? s – sim / n – não");
		String cond2 = sc.next();
		if (cond2.equals("s")) {
			System.out.println (cliente2.getNome()+" Quanto deseja depositar?");
			double primeiroDep2 =  sc.nextDouble();
			cliente2.setDepositar(primeiroDep2);
			cliente2.mostrarDados();
		} else {
		cliente2.mostrarDados();
		}
		
		while(true) {
		System.out.println ("\n"+cliente2.getNome()+" deseja realizar uma operação? Digite 1.deposito 2.saque 3.não");
		int operacao2 = sc.nextInt();
			if (operacao2==1) {
				double valorDep2 = cliente2.transacao(operacao2);
				System.out.printf("\nValor deposito: R$%.2f\n", valorDep2);
				cliente2.mostrarDados();
			} else if (operacao2==2){
				double valorSaq2 = cliente2.transacao(operacao2);
				System.out.printf("\nValor saque: R$%.2f\n", valorSaq2);
				cliente2.mostrarDados();
			} else {
				break;
			}
		}
	sc.close();
	}
}