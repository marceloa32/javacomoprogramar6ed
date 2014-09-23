/*
* GradeBookTest.java
* Java como programar 6a. edicao - p. 67
*/
import java.util.Scanner;

public class TestaLivroDeNotas3{

	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		LivroDeNotas3 livroDeNotas = new LivroDeNotas3();
		
		System.out.printf("Nome inicial do curso: %s\n\n", livroDeNotas.getNomeDoCurso());
		
		System.out.println("Digite o nome do curso:");
		String nome = entrada.nextLine();
		livroDeNotas.setNomeDoCurso(nome);
		System.out.println();
		
		livroDeNotas.mostrarMensagem();
	}
}