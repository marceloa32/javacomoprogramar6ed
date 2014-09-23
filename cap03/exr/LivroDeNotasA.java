/*
* Exercício 3.11
* Java como programar 6a. edicao - p. 85
*/
public class LivroDeNotasA{

	private String nomeDoCurso;
	private String nomeDoInstrutor;
	
	public LivroDeNotasA(String nomeDoCurso, String nomeDoInstrutor){
		this.nomeDoCurso = nomeDoCurso;
		this.nomeDoInstrutor = nomeDoInstrutor;
	}
	
	public void setNomeDoCurso(String nomeDoCurso){
		this.nomeDoCurso = nomeDoCurso;
	}
	
	public String getNomeDoCurso(){
		return this.nomeDoCurso;
	}
	
	public void setNomeDoInstrutor(String nomeDoInstrutor){
		this.nomeDoInstrutor = nomeDoInstrutor;
	}
	
	public String getNomeDoInstrutor(){
		return this.nomeDoInstrutor;
	}
	
	public void mostrarMensagem(){
		System.out.printf("Bem-vindo ao livro de notas do curso\n%s!\n", getNomeDoCurso());
		System.out.printf("Este curso é ministrado por\n%s!\n", getNomeDoInstrutor());
	}

}
