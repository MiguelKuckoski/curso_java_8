package udemy.java8.unidade2.lambdas;

import java.util.Arrays;
import java.util.List;

public class LambdaApp {
	
	int somatorio;

	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(1,2,3,4,5);
		LambdaApp app = new LambdaApp();
		
		int numero = 10;
		System.out.println(lista);
		
//		for (Integer integer : lista) {
//			integer = integer + 10;
//			
//			System.out.println(integer);
//		}

		lista.forEach(x -> {
			x += numero;
			
			int y = x/2;
			
			System.out.println("x = " +x);
			System.out.println("y= " +y);
			app.somatorio += x;
		});
		
		System.out.println(app.somatorio);
		
		
		
	}

}
