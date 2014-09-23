/*
* Exerc¡cios 5.16
* Java como programar 6a edicao - p. 162
*/
import java.util.Scanner;

public class GraficoAsterisco2{
   
   public static void main(String[] args){      
      
      int numero = 0;
      Scanner entradaTeclado = new Scanner(System.in);
 
      
      while(numero != -1){

         System.out.printf("Digite um numero entre 1 e 30 (-1 para sair): \n");
         numero = entradaTeclado.nextInt();      
               
         if(numero == -1){
            break;
         } else if (numero < 1 || numero > 30){
            System.out.println("Numero invalido");
            continue;
         }
         
         for (int i = 1; i<= numero; i++){
            System.out.print("*");
         }         
         
         System.out.println("\n");
         
      }
      
      
         
   }   
   
}