/*
* GradeBookTest.java
* Java como programar 6a. edicao - p. 70
*/

public class TestaLivroDeNotas4{

	public static void main(String[] args){
		
		LivroDeNotas4 livroDeNotasA = new LivroDeNotas4("Introdução à programação Java");
		LivroDeNotas4 livroDeNotasB = new LivroDeNotas4("Estrutura de dados em Java");
		
		System.out.printf("Curso do livro de notas A: %s\n", livroDeNotasA.getNomeDoCurso());
		System.out.printf("Curso do livro de notas B: %s\n", livroDeNotasB.getNomeDoCurso());
	
	}

}