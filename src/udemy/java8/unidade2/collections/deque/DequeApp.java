package udemy.java8.unidade2.collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeApp {
	public static void main(String[] args) {
		Deque<String> lista = new ArrayDeque<>();
		
		lista.add("vermelho");
		lista.add("verde");
		lista.add("verde");
		lista.add("Amarelo");
		
		System.out.println(lista);
		lista.removeFirst();
		lista.removeLast();
		System.out.println(lista);
		
		lista.addFirst("azul");
		lista.addLast("Roxo");
		System.out.println(lista);
		
		System.out.println(lista.peekFirst());
		System.out.println(lista.peekLast());
		
	}
}
