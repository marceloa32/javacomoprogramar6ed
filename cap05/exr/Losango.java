/*
* Exerc¡cios 5.24
* Java como programar 6a edicao - p. 163
*/
public class Losango{
 
   public static void main(String args[]){
                                   
      int tamanho = 9;
      int pular = tamanho / 2;                                   
      int incremento = 1;
      
      System.out.printf("%d\n", pular);      
      
      for(int i = 1; i <= tamanho; i++){

         for(int j = 1; j <= tamanho; j ++){

            if(j>pular && j<(tamanho-pular+1)){
               System.out.printf("*");
            } else {
               System.out.printf(" ");
            }            
            
         }
         
         System.out.println();         
         pular-=incremento;
         if(pular == 0)
            incremento=-1;

      }
   }   
   
}
