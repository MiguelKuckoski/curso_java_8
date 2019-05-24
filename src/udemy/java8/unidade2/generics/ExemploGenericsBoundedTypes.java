package udemy.java8.unidade2.generics;

public class ExemploGenericsBoundedTypes <T extends Number>{
	private T [] obj;

	public ExemploGenericsBoundedTypes(T[] obj) {
		this.obj = obj;
	}
	
	public T [] getObj() {
		return obj;
	}

	public void setObj(T [] obj) {
		this.obj = obj;
	}
	
	@SuppressWarnings("null")
	public void media() {
		Double soma = null;
		int i;
		for(i=0; i < obj.length; i++) {
			soma += obj[i].doubleValue();
		}
	}
	
	
}
