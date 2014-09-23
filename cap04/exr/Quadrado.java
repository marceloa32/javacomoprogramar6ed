/**
* Exercício 4.29
* Java Como Programar 6a edição p. 124
*/
import java.util.Scanner;

public class Quadrado{

	public static void main(String[] args){
	
	
		Scanner entradaTeclado = new Scanner(System.in);
		int tamanho = 0;
		
		System.out.print("Digite o tamanho do lado (1 a 20; -1 sai): ");
		tamanho = entradaTeclado.nextInt();
		
		while (tamanho != -1){
		
			if(tamanho < 1 || tamanho > 20)
				System.out.println("Valor invalido");
			else
				desenhar(tamanho);
			System.out.print("Digite o tamanho do lado (1 a 20; -1 sai): ");
			tamanho = entradaTeclado.nextInt();
		}
		
		
	}
	
	public static void desenhar(int tamanho){
	
		int x = 1;
		int y = 1;
		
		while (y <= tamanho){

			System.out.print("*");
			x = 1;
			while (x <= (tamanho-2)){
				//primeira ou ultima linha: cheia
			   if(y == 1 || y == tamanho)
					System.out.print("*");
				else
					System.out.print(" ");
				x++;
			}
			System.out.print("*");
			System.out.print("\n");
			y++;
		}
		
	
	}
}