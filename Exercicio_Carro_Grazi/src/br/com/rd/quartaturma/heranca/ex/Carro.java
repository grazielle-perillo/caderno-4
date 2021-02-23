package br.com.rd.quartaturma.heranca.ex;

public class Carro {
	final int  VELOCIDADEMAXIMA;
	int velocidadeAceleracao;
	int velocidadePadrao;

	Carro ( int velocidadeMaxima, int velocidadeAceleracao){
		this.VELOCIDADEMAXIMA = velocidadeMaxima;
		this.velocidadeAceleracao = velocidadeAceleracao;
	}
	
	int acelerar () {
		int limite = this.VELOCIDADEMAXIMA-this.velocidadeAceleracao;
		if(this.velocidadePadrao==this.VELOCIDADEMAXIMA){
			return this.velocidadePadrao;
		} else if (velocidadePadrao<=limite) {
			this.velocidadePadrao= this.velocidadePadrao +this.velocidadeAceleracao;
			return this.velocidadePadrao;
		} else {
			this.velocidadePadrao= this.VELOCIDADEMAXIMA;
			return this.velocidadePadrao;
		}
	}

	int frear () {
		if (this.velocidadePadrao<5) {
			this.velocidadePadrao=0;
			return this.velocidadePadrao;
		} else {
		this.velocidadePadrao = velocidadePadrao-5;
		return this.velocidadePadrao;
		}
	}
	
	public void mostrarDados (String x) {
		if (x.equals("acelerar")) {
			for (int n = 0;n<101; n = n+10) {
				this.acelerar();
				System.out.println ("Velocidade atual:"+velocidadePadrao+"km/h");
			}
		} else {
			for (int n = 100;n>=0; n = n-5) {
				this.frear();
				System.out.println ("Velocidade atual:"+velocidadePadrao+"km/h");
			}
		}
	}
}
