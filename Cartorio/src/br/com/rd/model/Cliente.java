package br.com.rd.model;

import java.util.ArrayList;
import java.util.List;

import br.com.rd.abstratas.Documento;

public class Cliente {
	int cpf;
	int cnpj;
	String nome;
	String razSocial;
	
	List<Documento> DocsPessoais = new ArrayList<>();
}
