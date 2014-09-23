/*
* GradeBook.java
* Java como programar 6a. edicao - p. 65
*/
public class LivroDeNotas3{

	private String nomeDoCurso;
	
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