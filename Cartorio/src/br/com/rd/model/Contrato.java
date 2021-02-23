package br.com.rd.model;

import br.com.rd.abstratas.Documento;

public class Contrato extends Documento {

	@Override
	public boolean registrar(Object objeto) {
		return false;
	}
}
