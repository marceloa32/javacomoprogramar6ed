/**
* Exercicios 6.18, 6.19
* Java Como Programar 6a edicao p. 200
*/
public class QuadradoDeCaracteres{
   
   public void quadradoDeAsteriscos(int lado){
      
      for(int i = 1; i <= lado; i++){
         
         for(int j = 1; j <= lado; j++){
            System.out.printf("*");         
         }
         
         System.out.println();
      }
      
   }
   
   public void quadradoDeCaracteres(int lado, char caracterDePreenchimento){
      
      for(int i = 1; i <= lado; i++){
         
         for(int j = 1; j <= lado; j++){
            System.out.printf("%c",caracterDePreenchimento);         
         }
         
         System.out.println();
      }
      
   }   
   
}