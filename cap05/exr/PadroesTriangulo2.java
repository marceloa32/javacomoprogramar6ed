/*
* Exerc¡cios 5.22
* Java como programar 6a edicao - p. 162
*/
public class PadroesTriangulo2{
   
   public static void main(String args[]){
      
      for(int i = 1; i <= 10; i++){
         
         for(int j = 1; j <= 10; j++){
            if(j<=i){
               System.out.print("*");
            }else{
               System.out.print(" ");
            }            
         }         
         
         System.out.print("\t");
         
         for(int j = 10; j >= 1; j--){
            if(j>=i){
               System.out.print("*");
            }else{                              
               System.out.print(" ");
            }
         }         
         
         System.out.print("\t");
         
         for(int j = 1; j <= 10; j++){
            if(j>=i){
               System.out.print("*");
            }else{
               System.out.print(" ");
            }
         }         
         
         System.out.print("\t");
         
         for(int j = 10; j >= 1; j--){
            if(j<=i){
               System.out.print("*");
            }else{
               System.out.print(" ");
            }            
            
         }                                    
         
         
         System.out.println();
      }
   }
}