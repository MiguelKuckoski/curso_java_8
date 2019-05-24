package udemy.java8.unidade2.collections.List;

import java.util.LinkedList;

public class LinkedListApp {
	public static void main(String[] args) {
		//Fila (First-in, First-out)
		LinkedList<String> lista = new LinkedList<>();

		lista.add("vermelho");
		lista.add("verde");
		lista.add("verde");
		lista.add("Amarelo");
		
		System.out.println(lista);
		
		lista.removeFirst();
		lista.removeLast();
		
		System.out.println(lista);
	}
}
