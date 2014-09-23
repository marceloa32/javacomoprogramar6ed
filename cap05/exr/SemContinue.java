/*
* Exerc¡cios 5.28
* Java como programar 6a edicao - p. 163
*/
public class SemContinue{
   
   public static void main(String []args){
      
      for (int contador = 1; contador <= 10; contador++){
         
         if(contador == 5)
            continue;
            
         System.out.printf("%d", contador);
      }
      
      System.out.println("\nContinue usado para pular o 5\n");
      
      for (int contador = 1; contador <= 10; contador++){
         
         if ( !(contador == 5) ){
            System.out.printf("%d", contador);
         }
      }
      
      System.out.println("\nPulou o 5 sem continue\n");      
   }   
   
}