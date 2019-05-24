package udemy.java8.unidade2.generics.persistenia;

public interface IDAO <T>{
	
	public void create(T entidade);
	public void read(T entidade);
	public void update(T entidade);
	public void delete(T entidade);
}
