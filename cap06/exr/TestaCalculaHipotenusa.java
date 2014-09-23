/**
* Exercicio 6.15
* Java Como Programar 6a edicao p. 200
*/
import java.util.Scanner;

public class TestaCalculaHipotenusa{
   
   public static void main(String[] args){

      Scanner entradaTeclado = new Scanner( System.in );
      CalculaHipotenusa ch = new CalculaHipotenusa();
      double cateto1, cateto2;
      
      System.out.printf("%s\n\n","Hipotenusa");
      
      System.out.printf("1o cateto (0 p/ sair): ");
      cateto1 = entradaTeclado.nextDouble();
      
      while(cateto1 != 0.0){
         
         if( cateto1 < 0.0 ){
         
            System.out.printf("-> Valor invalido");
         
         } else {            
         
            System.out.printf("2o cateto ...........: ");
            cateto2 = entradaTeclado.nextDouble();
            
            if( cateto2 < 0.0 ){
            
               System.out.printf("-> Valor invalido");               
               
            } else {
               System.out.printf("Hipotenusa = %.3f", ch.hipotenusa(cateto1, cateto2));
            }            
            
         }
         
         System.out.printf("\n1o cateto (0 p/ sair): ");
         cateto1 = entradaTeclado.nextDouble();         
      }     
      
      
      
   }   
   
}