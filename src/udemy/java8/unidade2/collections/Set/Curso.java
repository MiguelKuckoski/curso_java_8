package udemy.java8.unidade2.collections.Set;

import java.nio.file.Path;

public class Curso {

	private int cdCurso;
	private String nome;
	private float valor;
	private Path url;
	
	public Curso(int cdCurso, String nome, float valor, Path url) {
		super();
		this.cdCurso = cdCurso;
		this.nome = nome;
		this.valor = valor;
		this.url = url;
	}
	
	public int getCdCurso() {
		return cdCurso;
	}
	public void setCdCurso(int cdCurso) {
		this.cdCurso = cdCurso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Path getUrl() {
		return url;
	}
	public void setUrl(Path url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + "]";
	}	
	
}
