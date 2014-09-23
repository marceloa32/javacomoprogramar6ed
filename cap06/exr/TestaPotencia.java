/**
* Exercicio 6.14
* Java Como Programar 6a edicao p. 200
*/
import java.util.Scanner;

public class TestaPotencia{
   
   public static void main(String[] args){
      
      Scanner entradaTeclado = new Scanner(System.in);
      Potencia potencia = new Potencia();
      
      int base = 1, expoente;
      
      System.out.printf("\nBase (0 p/ sair): ");
      base = entradaTeclado.nextInt();
      
      while(base != 0){
         
         System.out.printf("Expoente .......: ");
         expoente = entradaTeclado.nextInt();                  
         
         if(expoente > 0){
            System.out.printf("%d elevado a %d = %d\n", base, expoente, potencia.potenciaDeInteiro(base,expoente));            
         } else {
            System.out.printf("=> Expoente invalido\n");
         }
         
         System.out.printf("\nBase (0 p/ sair): ");
         base = entradaTeclado.nextInt();         
         
         
      }
      
      
   }
   
}
