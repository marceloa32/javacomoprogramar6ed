/*
* Exercício 3.11
* Java como programar 6a. edicao - p. 85
*/
import java.util.Scanner;

public class TestaLivroDeNotasA{

	public static void main(String[] args){
	
		LivroDeNotasA livro = new LivroDeNotasA("temp", "temp");
		System.out.println("--------------------");
		livro.mostrarMensagem();
		System.out.println("--------------------\n");
		
		Scanner entrada = new Scanner(System.in);
		String nome = "";
		
		System.out.printf("Digite o nome do curso ...: \n");
		nome = entrada.nextLine();
		livro.setNomeDoCurso(nome);
		
		System.out.printf("Digite o nome do instrutor: \n");
		nome = entrada.nextLine();		
		livro.setNomeDoInstrutor(nome);
		
		System.out.println("--------------------");
		livro.mostrarMensagem();
		System.out.println("--------------------");
	
	}

}