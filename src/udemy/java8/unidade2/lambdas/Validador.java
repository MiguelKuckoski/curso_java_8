package udemy.java8.unidade2.lambdas;

@FunctionalInterface
public interface Validador<T> {

	boolean validada(T t);
}
