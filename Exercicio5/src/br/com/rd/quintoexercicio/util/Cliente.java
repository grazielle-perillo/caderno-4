package br.com.rd.quintoexercicio.util;

import java.util.Scanner;

public class Cliente {
	
	Scanner sc = new Scanner(System.in);
	
	private String nome;
	private int conta;
	private double saldo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int numeroConta) {
		this.conta = numeroConta;
	}
	public void setDepositar(double deposito) {
		this.saldo = this.saldo + deposito;
	}

	public double transacao (int operacao) {
		if (operacao == 1) {
			System.out.println (getNome()+" Quanto deseja depositar?");
			double valor = sc.nextDouble();
			setDepositar(valor);
			return valor;
		} else {
			System.out.println (getNome()+" Quanto deseja sacar?");
			double valor = sc.nextDouble();
			this.saldo = this.saldo-(valor+5);
			return valor;
		}
	}
	public void mostrarDados () {
		System.out.println ("Dados da Conta:\nConta número:"+conta+", Titular:"+nome+", Saldo: R$"+formatarValor(saldo));
	}
	public String formatarValor(double valor) {
	return String.format("%.2f", valor);
	}
}
