package udemy.java8.unidade2.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkeHashMapApp {
	public static void main(String[] args) {
		Map<Integer, String> mapa = new LinkedHashMap<>();
		
		mapa.put(4, "Bruno");;
		mapa.put(2, "Umberto");
		mapa.put(3, "Fernando");
		mapa.put(3, "Caetano");
		mapa.put(1, "Umberto");
		
		System.out.println(mapa);
		// {4=Bruno, 2=Umberto, 3=Caetano, 1=Umberto} - ordem de inserção.
 
	}

}

