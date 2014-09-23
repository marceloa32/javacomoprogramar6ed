/* 
 * Exercicio 2.28
 * Java como programar 6a edicao - p. 55-6
*/
import java.util.Scanner;

public class Circulo{

	public static void main(String[] args){
	
		Scanner leitor = new Scanner(System.in);
		
		int raio;
		
		System.out.print("Digite o raio do circulo: ");
		raio = leitor.nextInt();
		
		System.out.println("");
		System.out.printf("Diametro       = %d\n", 2 * raio);
		System.out.printf("Circunferencia = %f\n", 2 * Math.PI * raio);
		System.out.printf("Area           = %f\n", Math.PI * raio * raio);
	}

}
