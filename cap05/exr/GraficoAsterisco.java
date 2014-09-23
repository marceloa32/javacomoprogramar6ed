/*
* Exerc¡cios 5.16
* Java como programar 6a edicao - p. 162
*/
import java.util.Scanner;

public class GraficoAsterisco{
   
   public static void main(String[] args){      
      
      int numero;
      Scanner entradaTeclado = new Scanner(System.in);
 
      System.out.printf("Digite um numero entre 1 e 30 (-1 para sair): \n");
      numero = entradaTeclado.nextInt();      
      
      while(numero != -1){
         
         if(numero < 1 || numero > 30){
            System.out.println("Numero invalido");
         } else {
         
            for (int i = 1; i<= numero; i++){
               System.out.print("*");
            }
         }
         
         System.out.println("\n");
         
         System.out.printf("Digite um numero entre 1 e 30 (-1 para sair): \n");
         numero = entradaTeclado.nextInt();      
         
      }
      
      
         
   }   
   
}