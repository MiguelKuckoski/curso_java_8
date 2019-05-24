package udemy.java8.unidade2.lambdas;

public class calculadoraV2 {

	public static void main(String[] args) {
		calculadoraV2 cal = new calculadoraV2();
		
		IMath somar = (a,b) -> a+b;
		IMath subtrair = (a,b) -> a-b;
		IMath dividir = (a,b) -> a/b;
		IMath multiplicar = (a,b) -> a*b;
		IMath exponenciacao = (a, b) -> Math.pow(a, b); 
		IMath radiciacao = (a, b) -> Math.pow(a, 1/b);
		
		/*** Chamada das expressoes Lambdas ***/
		System.out.println(cal.execoperacao(5, 3, somar));
		System.out.println(cal.execoperacao(5, 3, subtrair));
		System.out.println(cal.execoperacao(5, 3, dividir));
		System.out.println(cal.execoperacao(5, 3, multiplicar));
		System.out.println(cal.execoperacao(5, 3, exponenciacao));
		System.out.println(cal.execoperacao(5, 3, radiciacao));
		

	}
	
	private double execoperacao(int a, int b, IMath mat) {
		return mat.operacao(a, b);

	}

}