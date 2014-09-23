/*
* Exerc¡cio 5.13
* Java como programar 6a edicao - p. 162
*/
public class FatorialDe5{
   
   public static void main(String args[]){

      int limite = 5;      
      long fatorial;
      
      for(int i = 1; i <= limite; i++){
         
         fatorial = 1l;
         for(int j = 1; j<=i; j++){
            fatorial*=j;
         }
         
         System.out.printf("O fatorial de %d e' %d\n", i, fatorial);
         
         
      }
      
      
   }
   
   
}