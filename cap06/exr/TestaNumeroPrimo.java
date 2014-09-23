/*
* Exercicio 6.25
* Java Como Programar 6a edicao p. 201
*/
public class TestaNumeroPrimo{
   
   public static void main(String[] args){
      
      NumeroPrimo np = new NumeroPrimo();

      long inicio = System.currentTimeMillis();
            
      for(int i = 1; i <= 10000; i++){

         //‚ par e ‚ nÆo 2 - nÆo ‚ primo      
         if( !(i % 2 == 0 && i > 2) ){
            if( np.isPrimo(i) ){
               System.out.printf("%d\n", i);
            }
         }   
         
      }
      
      long fim = System.currentTimeMillis();
      System.out.printf("metodo 1: %d ms\n\n", (fim-inicio) );
      
      //-----------
      
      inicio = System.currentTimeMillis();      
      
      for(int i = 1; i <= 10000; i++){

         //‚ par e ‚ nÆo 2 - nÆo ‚ primo      
         if( !(i % 2 == 0 && i > 2) ){
            if( np.isPrimo2(i) ){
               System.out.printf("%d\n", i);
            }
         }   
         
      }
      
      fim = System.currentTimeMillis();
      System.out.printf("metodo 2: %d ms\n\n", (fim-inicio) );
      
      
   }   
   
}
