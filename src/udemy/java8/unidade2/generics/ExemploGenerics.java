package udemy.java8.unidade2.generics;

public class ExemploGenerics <T>{
	
	private T obj;
	
	
	public ExemploGenerics (T obj) {
		this.setObj(obj);
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public void showType() {
		System.out.println(obj.getClass().getName());
	}
}
