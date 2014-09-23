/*
* GradeBook.java - figura 3.10
* Java como programar 6a. edicao - p. 69
*/
public class LivroDeNotas4{

	private String nomeDoCurso;
	
	public LivroDeNotas4(String nomeDoCurso){
		this.nomeDoCurso = nomeDoCurso;
	}
	
	public void setNomeDoCurso(String nomeDoCurso){
		this.nomeDoCurso = nomeDoCurso;
	}
	
	public String getNomeDoCurso(){
		return this.nomeDoCurso;
	}
	
	public void mostrarMensagem(){
		System.out.printf("Bem-vindo ao livro de notas do curso\n%s!\n", getNomeDoCurso());
	}

}
