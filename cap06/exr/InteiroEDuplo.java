/**
* Exercicio 6.9
* Java Como Programar 6a edicao p. 199
*/
import java.util.Scanner;

public class InteiroEDuplo{   
   
   public static void main(String[] args){
      
      Scanner entradaTeclado = new Scanner(System.in);
      double numeroD = -1.0;
      int numeroI;
      
      System.out.printf("Digite numero de ponto flutuante (0 sair) : ");
      numeroD = entradaTeclado.nextDouble();
      
      while(numeroD != 0.0){
         
         numeroI = (int) Math.floor( numeroD + 0.5 );
         
         System.out.printf("Original: %.2f\tArredondado: %d\n", numeroD, numeroI);
         
         System.out.printf("Digite numero de ponto flutuante (0 sair) : ");
         numeroD = entradaTeclado.nextDouble();
         
      }      
      
   }
   
}
