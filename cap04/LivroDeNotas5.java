/*
* Gradebook.java - Figura 4.6
* Java como programar 6a. edicao - p. 95/96
*/
import java.util.Scanner;

public class LivroDeNotas5{

	private String nomeDoCurso;
	
	public LivroDeNotas5(String nomeDoCurso){
		this.nomeDoCurso = nomeDoCurso;
	}
	
	public void setNomeDoCurso(String nomeDoCurso){
		this.nomeDoCurso = nomeDoCurso;
	}
	
	public String getNomeDoCurso(){
		return this.nomeDoCurso;
	}
	
	public void mostrarMensagem(){
		System.out.printf("Bem-vindo ao livro de notas do curso\n%s!\n\n", getNomeDoCurso());		
	}
	
	public void determinarMediaDaClasse(){
	
		Scanner entrada = new Scanner(System.in);
		
		int total;
		int contadorDeNotas;
		int nota;
		int media;
		
		total = 0;
		contadorDeNotas = 1;
		
		while(contadorDeNotas <= 10){
			
			System.out.print("Digite a nota: ");
			nota = entrada.nextInt();
			total = total + nota;
			
			contadorDeNotas = contadorDeNotas + 1;			
		}
		
		media = total / 10;
		
		System.out.printf("Total das 10 notas: %d\n", total);
		System.out.printf("Media da classe ..: %d\n", media);
		
	}

}