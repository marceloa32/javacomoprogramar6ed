/**
* Exercicio 6.36
* Java Como Programar 6a edicao p. 202
*/
import java.util.Scanner;

public class TestaDistanciaEntrePontos{   
   
   public static void main(String[] args){
      
      Scanner entradaTeclado = new Scanner(System.in);
      DistanciaEntrePontos dep = new DistanciaEntrePontos();
      
      double x1, y1, x2, y2;
      
      System.out.printf("Distância entre pontos\n\n");
      System.out.printf("Digite os dados do ponto 1:\n");
      System.out.printf("x: ");
      x1 = entradaTeclado.nextDouble();

      System.out.printf("y: ");
      y1 = entradaTeclado.nextDouble();      
      
      System.out.printf("Digite os dados do ponto 2:\n");
      System.out.printf("x: ");
      x2 = entradaTeclado.nextDouble();

      System.out.printf("y: ");
      y2 = entradaTeclado.nextDouble();      

      System.out.printf("Distância entre os pontos %.2f|%.2f e %.2f|%.2f: %.2f\n", x1, y1, x2, y2, dep.distancia(x1, y1, x2, y2) );
      
   }   
   
}
