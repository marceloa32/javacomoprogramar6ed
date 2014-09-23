/*
* Exercicio 6.27
* Java Como Programar 6a edicao p. 201
*/
import java.util.Scanner;

public class TestaMdc{
   
   public static void main(String[] args){
      
      Scanner entradaSistema = new Scanner(System.in);
      Mdc mdc = new Mdc();
      
      int numero1 = -1, numero2 = -1;
      
      System.out.printf("Digite um no inteiro (0 p/ sair): ");
      numero1 = entradaSistema.nextInt();
      
      while (numero1 != 0){
         
         if(numero1 < 0){
            System.out.printf("\nNumero inv lido");
         } else {
            System.out.printf("Digite o segundo numero ........: ");
            
            numero2 = entradaSistema.nextInt();            

            int maxdivcom = mdc.mdc(numero1, numero2);
            if(maxdivcom == 0){
               System.out.printf("\n%d e %d sem divisor comum\n", numero1, numero2);
            } else {
               System.out.printf("\nmdc de %d e %d ................ = %d\n", numero1, numero2, maxdivcom);   
            }            
            
         }
         
         System.out.printf("Digite um no inteiro (0 p/ sair): ");
         numero1 = entradaSistema.nextInt();         
         
      }
      
      
   }   
   
}

