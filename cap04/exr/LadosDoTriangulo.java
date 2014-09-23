/**
* Exercício 4.35
* Java Como Programar 6a edição p. 124
*/
import java.util.Scanner;

public class LadosDoTriangulo{

	public static void main(String[] args){
		
		int x, y, z;
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.print("Triangulo - -1 para sair\n\n");
		
		System.out.print("Digite o valor do lado 1: ");
		x = entradaTeclado.nextInt();
		
		System.out.print("Digite o valor do lado 2: ");
		y = entradaTeclado.nextInt();		
		
		System.out.print("Digite o valor do lado 3: ");
		z = entradaTeclado.nextInt();				
		
		while(x != -1 && y != -1 && z != -1){
		
			if(x > 0 && y > 0 && z > 0){
				validarTriangulo(x, y, z);
			} else {
				System.out.print("Ha lados com valor zero");
			}

			System.out.print("Digite o valor do lado 1: ");
			x = entradaTeclado.nextInt();
		
			System.out.print("Digite o valor do lado 2: ");
			y = entradaTeclado.nextInt();		
		
			System.out.print("Digite o valor do lado 3: ");
			z = entradaTeclado.nextInt();						
		
		
		}
		
	}
	
	public static void validarTriangulo(int lado1, int lado2, int lado3){
	
		int a, b, c;
		
		//a maior lado, b médio, c menor
		if(lado1 > lado2 && lado2 > lado3){
			a = lado1;
			b = lado2;
			c = lado3;
		} else if (lado1 > lado3 && lado3 > lado2){
			a = lado1;
			b = lado3;
			c = lado2;
		} else if (lado2 > lado3 && lado3 > lado1){
			a = lado2;
			b = lado3;
			c = lado1;
		} else if (lado2 > lado1 && lado1 > lado3){
			a = lado2;
			b = lado1;
			c = lado3;	
		} else if (lado3 > lado2 && lado2 > lado1){
			a = lado3;
			b = lado2;
			c = lado1;		
		} else  {
			a = lado3;
			b = lado1;
			c = lado2;
		}
		
		// agora testa a condição de existencia
		// if ( (((lado2 + lado3) > lado1) && (lado1 > (lado2-lado3))) &&
		     // (((lado1 + lado3) > lado2) && (lado2 > (lado1-lado3))) &&
			  // (((lado1 + lado2) > lado3) && (lado3 > (lado1-lado2))) )
			  // System.out.printf("%d, %d e %d podem representar os lados do triangulo\n\n", lado1, lado2, lado3);
		// else
			// System.out.printf("%d, %d e %d nao podem representar os lados do triangulo\n\n", lado1, lado2, lado3);

		if ( (((b + c) > a) && (a > (b-c))) &&
		     (((a + c) > b) && (b > (a-c))) &&
			  (((a + b) > c) && (c > (a-b))) )
			  System.out.printf("%d, %d e %d podem representar os lados do triangulo\n\n", lado1, lado2, lado3);
		else
			System.out.printf("%d, %d e %d nao podem representar os lados do triangulo\n\n", lado1, lado2, lado3);
			
	}
}