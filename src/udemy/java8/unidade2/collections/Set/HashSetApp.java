package udemy.java8.unidade2.collections.Set;

import java.util.HashSet;

public class HashSetApp {

	public static void main(String[] args) {
		// HashSet não permite valores duplicados. 
		
		HashSet<String> lista = new HashSet<>();
		
		lista.add("Vermelho");
		lista.add("Verde");
		
		if(!lista.add("Verde")) {
			lista.add("Azul");
		}
		
		lista.add("Amarelo");
		
		System.out.println(lista); // [Vermelho, Amarelo, Verde, Azul] (Ordem Aleatória).

	}

}
