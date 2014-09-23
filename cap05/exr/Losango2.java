/*
* Exerc¡cios 5.25
* Java como programar 6a edicao - p. 163
*/
import java.util.Scanner;

public class Losango2{
 
   public static void main(String args[]){
      
      Scanner entradaTeclado = new Scanner( System.in );
      int tamanho;
      
      System.out.printf("Tamanho do losango (impares de 1 a 19; -1 sai): ");
      tamanho = entradaTeclado.nextInt();

                                         
      while (tamanho != -1){
         
         if( (tamanho % 2 == 0) || (tamanho > 19 && tamanho < 1) ){
            
            System.out.println("Tamanho invalido");
         
         } else {
            
            System.out.println();
            
            int pular = tamanho / 2;                                   
            int incremento = 1;
            
            
            for(int i = 1; i <= tamanho; i++){
      
               for(int j = 1; j <= tamanho; j ++){
      
                  //System.out.println(tamanho+"|"+pular);
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
         
         System.out.printf("\n\nTamanho do losango (impares de 1 a 19; -1 sai): ");
         tamanho = entradaTeclado.nextInt();         
        
      }
   }   
   
}
