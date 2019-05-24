package udemy.java8.unidade2.generics.persistenia;

public class PersistenciaApp {
	public static void main(String[] args) {
		
		GenericDao<Administrativo> admin = new GenericDao<>();
		admin.create(new Administrativo());
		
		GenericDao<Diretor> diretor = new GenericDao<>();
		diretor.create(new Diretor());
		
		//Simulação de GenericDao para manipulação de DB utilizando Generics.

	}
}
