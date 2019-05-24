package udemy.java8.unidade2.collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListApp {

	public static void main(String[] args) {
		
		// permite valores duplicados.
		
		
		List<String> lista = new ArrayList<String>();
		lista.add("vermelho");
		lista.add("verde");
		lista.add("verde");
		lista.add("Amarelo");
		
		System.out.println(lista);
		
		Collections.sort(lista); // ordenação.
		
		System.out.println(lista);	
	}

}
