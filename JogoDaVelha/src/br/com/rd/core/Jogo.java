package br.com.rd.core;

import java.util.Scanner;

import br.com.rd.tela.Tela;

public class Jogo {

	/**
	 * Array de Jogada, para marcar as jogadas realizadas.
	 */
	private final Jogada[] JOGADAS = new Jogada[9];
	
	/**
	 * Objeto de Tela, para realizar a comunicação com o Console.
	 */
	private final Tela TELA;
	
	/**
	 * Objeto de Scanner, para obter comunicação com o teclado.
	 */
	private final Scanner TECLADO;

	/**
	 * Construtor da classe Jogo.
	 */
	public Jogo() {
		TECLADO = new Scanner(System.in);
		TELA = new Tela();
		JOGADAS[0] = new Jogada(1, 1);
		JOGADAS[1] = new Jogada(1, 2);
		JOGADAS[2] = new Jogada(1, 3);
		JOGADAS[3] = new Jogada(2, 1);
		JOGADAS[4] = new Jogada(2, 2);
		JOGADAS[5] = new Jogada(2, 3);
		JOGADAS[6] = new Jogada(3, 1);
		JOGADAS[7] = new Jogada(3, 2);
		JOGADAS[8] = new Jogada(3, 3);
	}
	
	/**
	 * Destrutor da classe Jogo (para fechar o Scanner quando o objeto for destruído).
	 */
	public void finalize() {
		TECLADO.close();
	}
	
	public void exibirTela() {
		TELA.exibir(JOGADAS);
	}
	
	public void exibirJogadaInvalida() {
		TELA.exibirJogadaInvalida();
	}
	
	public void exibirJaFoiJogada() {
		TELA.exibirJaFoiJogada();
	}

	public Jogada obterProximaJogada() {
		int linha = obterLinha();		
		int coluna = obterColuna();
		String jogada = obterJogada();
		return new Jogada(linha, coluna, jogada);
	}

	private int obterLinha() {
		int linha;
		do {
			TELA.exibirDigiteLinha(); 
			linha = TECLADO.nextInt();
			if (linha < 1 || linha > 3) {
				TELA.exibirLinhaInvalida();
			}
		} while (linha < 1 || linha > 3);
		return linha;
	}

	private int obterColuna() {
		int coluna;
		do {
			TELA.exibirDigiteColuna();
			coluna = TECLADO.nextInt();
			if (coluna < 1 || coluna > 3) {
				TELA.exibirColunaInvalida();
			}
		} while (coluna < 1 || coluna > 3);
		return coluna;
	}
	
	private String obterJogada() {
		String jogada;
		do {
			TELA.exibirDigiteJogada();
			jogada = TECLADO.next();
			if (!"XxOo".contains(jogada)) {
				TELA.exibirJogadaInvalida();
			}
		} while (!"XxOo".contains(jogada));
		return jogada;
	}
	
	/**
	 * Se a Jogada já foi realizada anteriormente, retornar true.
	 * Caso contrário, false.
	 */
	public boolean jaFoi(Jogada jogada) {
		return false;
	}

	/**
	 * Marca Jogada realizada para posterior exibição na tela.
	 */
	public void marcaJogada(Jogada jogada) {
	}

	/**
	 * Verifica se o jogo já acabou.
	 * É fim de jogo (deve retornar true) quando: 
	 * - X ou O foi marcado em três posições consecutivas, na horizontal, na vertical ou na diagonal; OU
	 * - não houver mais jogadas possíveis para fazer (todas as casas preenchidas). 
	 */
	public boolean acabou() {
		
		return false;
	}

	public void exibirInicioDeJogo() {
		TELA.exibirInicioDeJogo();
	}
	
	public void exibirFimDeJogo() {
		TELA.exibirFimDeJogo();
	}
	
}
