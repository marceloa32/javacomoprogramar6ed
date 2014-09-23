/*
* Exerc¡cios 5.26
* Java como programar 6a edicao - p. 163
*/
public class SemBreak{
   
   public static void main( String[] args ){
      
      int contador;
      
      for( contador = 1; contador <= 10; contador++ ){
         
         if( contador == 5 ){
            break;
         }         
         
         System.out.printf("%d\n", contador);
         
      }
      System.out.printf("\nBreak no loop no contador %d\n", contador);
      
      
      for( contador = 1; contador < 5; contador++ ){
         
         
         System.out.printf("%d\n", contador);
         
      }
      System.out.printf("\nSaiu do loop no contador %d\n", contador);
      
   }   
   
}
