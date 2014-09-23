/**
* Exercicio 6.16
* Java Como Programar 6a edicao p. 200
*/
import java.util.Scanner;

public class TestaVerificaMultiplos{
   
   public static void main(String args[]){

      Scanner entradaTeclado = new Scanner( System.in );
      VerificaMultiplos vm = new VerificaMultiplos();
      
      int controle = 1, numero1 = 0, numero2 = 0, numero = 0;
      
      System.out.printf("Digite 2 numeros (enter entre os numeros, ctrl+z calcula): ");
         
         
      while(entradaTeclado.hasNext()){
                 
         numero = entradaTeclado.nextInt();
        
         if(controle == 1)
            numero1 = numero;
         else
            numero2 = numero;

         controle ++;            
         
      }

      
      if(numero1 != 0){
      
         if(vm.verifica(numero1, numero2)){
            System.out.printf("%d e' multiplo de %d\n", numero2, numero1);
         } else {
            System.out.printf("%d nao e' multiplo de %d\n", numero2, numero1);
         }
   
      } else {
         System.out.printf("Nao ha multiplos de 0\n");
      }
         
      
      
   }
   
}
