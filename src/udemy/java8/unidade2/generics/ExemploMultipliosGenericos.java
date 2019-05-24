package udemy.java8.unidade2.generics;

public class ExemploMultipliosGenericos <T, V>{
	private T t;
	private V v;
	
	public ExemploMultipliosGenericos (T t, V v) {
		this.setT(t);
		this.setV(v);
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}
	
	public void showType() {
		System.out.println(t.getClass().getName());

		System.out.println(v.getClass().getName());
	}
}
