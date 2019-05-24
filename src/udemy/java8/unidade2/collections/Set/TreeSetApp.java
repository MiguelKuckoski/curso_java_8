package udemy.java8.unidade2.collections.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetApp {

	public static void main(String[] args) {

		Set<String> lista = new TreeSet<>(); // Não aceita duplicatas, mostra ordenado.
		lista.add("vermelho");
		lista.add("Verde");

		if (!lista.add("Verde")) {
			lista.add("Azul");
		}

		lista.add("Amarelo");
		
		System.out.println(lista); // [Amarelo, Azul, Verde, vermelho]
	}

}
