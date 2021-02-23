package br.com.rd.exercicio6.util;

public class Usuario {
	String nome;
	String codigo;

	public Usuario() {
		
	}
	public Usuario(String next, String i) {
		nome = next;
		codigo = i;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Usuario) {
			Usuario comparacao = (Usuario) obj;
			
			boolean nomeIgual = comparacao.nome.equals(this.nome);
			boolean codigoIgual = comparacao.codigo.equals(this.codigo);
			
			return nomeIgual&&codigoIgual;
			
		} else {
			return false;
		}
	}
		
}
