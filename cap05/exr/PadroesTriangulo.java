/*
* Exerc¡cios 5.15
* Java como programar 6a edicao - p. 162
*/
import java.util.Scanner;

public class PadroesTriangulo{
   
   public static void main(String[] args){

      int escolha;
      Scanner entradaTeclado = new Scanner(System.in);      

      System.out.printf("Escolha 1 a, 2 b, 3 c, 4 d, -1 sair:\n");                                                      
      escolha = entradaTeclado.nextInt();
      
      while(escolha != -1){
         System.out.println();
         switch(escolha){
   
            case 1:      
               for(int i = 1; i<=10; i++){
                  
                  for(int j = 1; j <= i; j++){
                     
                     System.out.print("*");
                     
                  }
                  
                  System.out.println();
               }
            break;
            
            case 2:
               for(int i = 10; i>=1; i--){
                  for(int j = 1; j <= i; j++){
                     System.out.print("*");
                  }
                  System.out.println();
               }         
            break;
            
            case 3:
               for(int i = 1; i <= 10; i++){
                  for(int j = 1; j <= 10; j++){
                     if(j>=i){
                        System.out.print("*");
                     } else {
                        System.out.print(" ");
                     }
                  }                  
                  System.out.println();
               }
            break;            
            
            case 4:
               for(int i = 1; i <= 10; i++){
                  for(int j = 1; j <= 10; j++){
                     if(j<i){
                        System.out.print(" ");
                     } else {
                        System.out.print("*");
                     }
                  }                  
                  System.out.println();
               }
            break;            
      
         }      
         
         System.out.printf("\nEscolha 1 a, 2 b, 3 c, 4 d, -1 sair:\n");                                                      
         escolha = entradaTeclado.nextInt();         
      
     }
      
      
   }
   
   
}