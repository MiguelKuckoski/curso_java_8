package udemy.java8.unidade2.generics;

public class NotaAluno {
	double valor;
	
	public <T extends Number> NotaAluno(T obj) {
		valor = obj.doubleValue();
	}
	
	public <T extends CharSequence> void oi(T obj) {
				String oi = obj.toString();
				System.out.println(oi);
	}
	
	
}
