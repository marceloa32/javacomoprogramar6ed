/*
* BreakTest
* Java como programar 6a edicao - p. 142
*/
public class TestaBreak{
   
   public static void main(String[] args){

      int contador;
      
      for(contador = 1; contador <= 10; contador++){
         
         if(contador == 5)
            break;
            
         System.out.printf("%d ", contador);      
      }
      
      System.out.printf("\nSaiu do loop com break no contador %d\n", contador);
   }
}
