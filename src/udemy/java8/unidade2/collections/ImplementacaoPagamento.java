package udemy.java8.unidade2.collections;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import udemy.java8.unidade2.collections.Set.Cliente;
import udemy.java8.unidade2.collections.Set.Curso;

public class ImplementacaoPagamento {
	
	static Map<Cliente, List<Curso>> pagamento = new HashMap<>();
	
	public static void listarCursos(List<Curso> cursos) {
		cursos.forEach(c -> System.out.println(c.toString()));

	}
	
	public static void main(String[] args) {
		// Criar os cursos disponiveis para venda.
		Curso java = new Curso(1, "Java 8", 200, Paths.get("/java8"));
		Curso python = new Curso(2, "Python", 300, Paths.get("/python"));
		Curso android = new Curso(3, "android", 500, Paths.get("/android"));
	
		// Cadastrar o cliente
		Cliente antonio = new Cliente("Antonio", "000.000.000-85", "antonioSampaio@hhh.com");
		
		// Criar lista de curso do cliente.
		List<Curso> cursosAntonio = new LinkedList<>();
		
		// fazer um check-out dos cursos escolhidos.
		
		Scanner entrada = new Scanner(System.in);
		int opcao = 0;
		
		while(opcao != 4) {
			
			System.out.println("1- Java\n"
					+ "2 - Python\n"
					+ "3 - Android\n"
					+ "4 - Sair");
			
			opcao = entrada.nextInt();
		
			if(opcao == 1) {
				cursosAntonio.add(java);
			}else if(opcao ==2 ) {
				cursosAntonio.add(python);
			}else if(opcao ==3 ) {
				cursosAntonio.add(android);
			}
		}
		entrada.close();
		
		pagamento.put(antonio, cursosAntonio);
		
		listarCursos(cursosAntonio);
		System.out.println(pagamento);
		
	}
	
	
}
