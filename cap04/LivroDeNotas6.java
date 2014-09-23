/*
* Gradebook.java - Figura 4.9
* Java como programar 6a. edicao - p. 100-102
*/
import java.util.Scanner;

public class LivroDeNotas6{

	private String nomeDoCurso;
	
	public LivroDeNotas6(String nomeDoCurso){
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
		double media;
		
		total = 0;
		contadorDeNotas = 0;
		
		System.out.print("Digite a nota ou -1 para sair: ");
		nota = entrada.nextInt();
		
		while(nota != -1){
		
			total = total + nota;
			contadorDeNotas = contadorDeNotas + 1;
			System.out.print("Digite a nota ou -1 para sair: ");
			nota = entrada.nextInt();			
			
		}
		
		if(contadorDeNotas != 0){
			media = (double) total / contadorDeNotas;
		
			System.out.printf("Total das %02d notas: %d\n", contadorDeNotas, total);
			System.out.printf("Media da classe ..: %.2f\n", media);
		} else {
			System.out.println("Nenhuma nota foi digitada");
		}
		
	}

}