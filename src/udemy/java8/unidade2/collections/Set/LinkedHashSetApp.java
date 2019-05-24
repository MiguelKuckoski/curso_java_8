package udemy.java8.unidade2.collections.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetApp {

	public static void main(String[] args) {
		// HashSet não permite valores duplicados.  (Ordem de inserção).
		Set<String> lista = new LinkedHashSet<String>();
		
		lista.add("Vermelho");
		lista.add("Verde");
		lista.add("Verde");
		lista.add("Amarelo");
		
		System.out.println(lista); // [Vermelho, Verde, Amarelo]

	}

}
