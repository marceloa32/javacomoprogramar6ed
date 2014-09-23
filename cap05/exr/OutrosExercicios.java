/*
* Exerc¡cios 5.9b, 5.10, 5.19a-g, 5.27
* Java como programar 6a edicao - p. 161, 162, 163
*/
public class OutrosExercicios{
   
   public static void main(String[] args){
  
      //5.9b
      int valor = 1;
      
      switch(valor % 2){
         case 0:
            System.out.println("Par");
            break;
         case 1:
            System.out.println("Impar");         
            break;
      }
      
      //5.10
      for(int i = 1; i <= 10; i++){
         for(int j = 1; j <= 5; j++){
            System.out.print('@');
         }
         System.out.println();
      }      
      
      
      //5.19
      int i = 1;
      int j = 2;
      int k = 3;
      int m = 2;
      System.out.println("a: " + ( i == 1 ));
      System.out.println("b: " + ( j == 3 ));
      System.out.println("c: " + ( ( i >= 1 ) && ( j < 4 ) ));
      System.out.println("d: " + ( ( m <= 99 ) & ( k < m ) ));
      System.out.println("e: " + ( ( j >= i ) || ( k == m ) ));
      System.out.println("f: " + ( ( k + m < j ) | ( 3 - j >= k) ));
      System.out.println("g: " + ( !(k > m) ));
      
      
      //5.27
      
      for(i = 1; i <= 5; i++){
         
         for(j = 1; j <= 3; j++){
            
            for(k = 1; k <= 4; k++)
               System.out.print('*');
               
            System.out.println();
         }
         
         System.out.println();
      }
      
      
   }   
   
}