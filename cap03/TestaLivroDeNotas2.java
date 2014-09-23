/*
* GradeBookTest.java
* Java como programar 6a. edicao - p. 62
*/
import java.util.Scanner;

public class TestaLivroDeNotas2{

	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		LivroDeNotas2 livroDeNotas = new LivroDeNotas2();
		
		System.out.println("Digite o nome do curso: ");
		String nomeDoCurso = entrada.nextLine();
		System.out.println();
		
		livroDeNotas.mostrarMensagem(nomeDoCurso);			
			
	}

}