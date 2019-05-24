package udemy.java8.unidade2.lambdas;

public class ValidadorApp {

	public static void main(String[] args) {	
		String celular = "99969-0490";
		
		Validador<String> validacao = valor -> valor.matches("[0-9]{5}-[0-9]{4}");
		
		System.out.println(validacao.validada(celular));
				
	}
}
