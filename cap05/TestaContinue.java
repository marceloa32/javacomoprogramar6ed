/*
* ContinueTest
* Java como programar 6a edicao - p. 143
*/
public class TestaContinue{
   
   public static void main(String[] args){
      
      for(int contador = 1; contador<=10; contador++){
         if(contador == 5)
            continue;
         System.out.printf("%d ", contador);
      }
      
      System.out.printf("\nContinue utilizado para pular o 5");
   }
   
}