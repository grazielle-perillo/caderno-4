package br.com.rd.usuarios;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Usuario {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de listas ");
		int qtListas = sc.nextInt();
		
		System.out.println("Informe a quantidade de nomes: ");
		int qtNomes = sc.nextInt();
		
		HashMap<Long, ArrayList<String>> listasUsuarios = new HashMap<>();
		
		for(int i = 0; i<qtListas; i++) {
			System.out.println("Informe o código identificador da lista:"+(i+1));
			Long codigo = sc.nextLong();
		
			ArrayList<String> nomes = new ArrayList<>(); 
			
			for(int j=0; j < qtNomes; j++) {
				System.out.println("Informe o nome " + (j+1) + " da lista"+(i+1));
				String nome = sc.next();
				
				nomes.add(nome);
			}
		
			
			listasUsuarios.put(codigo, nomes);	
		}
			
			for(Entry<Long, ArrayList<String>> listas : listasUsuarios.entrySet()) {
				System.out.println(listas.getKey());
				System.out.println(listas.getValue());

			}		
			
		sc.close();
		}
}