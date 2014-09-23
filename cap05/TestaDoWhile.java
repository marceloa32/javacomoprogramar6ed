/*
* DoWhileTest
* Java como programar 6a edicao - p. 128
*/
public class TestaDoWhile{
   
   public static void main(String[] args){
      
      int contador = 1;
      
      do{
         System.out.printf("%d ", contador);
         ++contador;
      }while(contador <= 10);
      
      System.out.println();
   }
}