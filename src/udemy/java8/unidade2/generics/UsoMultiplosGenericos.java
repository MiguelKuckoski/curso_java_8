package udemy.java8.unidade2.generics;

public class UsoMultiplosGenericos {

	public static void main(String[] args) {
		ExemploMultipliosGenericos<Integer,	String> exemplo = new ExemploMultipliosGenericos<>(88,"oi");
		
		exemplo.showType();

	}

}
