/*
* Exerc¡cio 5.12
* Java como programar 6a edicao - p. 161
*/
public class ProdutoDosImpares{
   
   public static void main(String args[]){
       
      int produto = 1;
      
      for(int i = 1; i <= 15; i+=2){
         produto*=i;
      }
      System.out.printf("O produto e': %d", produto);
   }   
   
}
