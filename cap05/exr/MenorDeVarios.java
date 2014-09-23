/*
* Exerc¡cio 5.11
* Java como programar 6a edicao - p. 161
*/
import java.util.Scanner;

public class MenorDeVarios{
   
   public static void main(String[] args){
      
      int numero = 0;
      int limite = 0;
      int menor = 2147483647;
      Scanner entradaTeclado = new Scanner(System.in);
      
      System.out.println("Digite a quantidade de numeros (-1 para sair):");      
      limite = entradaTeclado.nextInt();
      
      while(limite != -1){

         System.out.printf("Voce escolheu inserir %d numeros\n", limite);
         
         for(int i = 1; i<=limite; i++){
            System.out.printf("Numero %d: ", i);      
            numero = entradaTeclado.nextInt();            
            if(numero < menor){
               menor = numero;
            }
         }
         System.out.printf("O menor e' %d\n\n", menor);         
        
         System.out.println("Digite a quantidade de numeros (-1 para sair):");      
         limite = entradaTeclado.nextInt();
         
      }

      
   }
   
}
