package udemy.java8.unidade2.generics;

public class usoGenerico {
	public static void main(String[] args) {
		ExemploGenerics<Integer> iob = new ExemploGenerics<>(88);
		iob.showType();
		int v = iob.getObj();
		System.out.println("valor de v: "+v);
		
		ExemploGenerics<String> sob = new ExemploGenerics<String>("Tudo bom?");
		
		sob.showType();
		
		String oi = sob.getObj();
		System.out.println("Valor de oi: "+oi);
 		
	}
}
