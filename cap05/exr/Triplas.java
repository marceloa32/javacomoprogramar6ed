/*
* Exerc¡cios 5.21
* Java como programar 6a edicao - p. 162
*/
public class Triplas{   
   
   public static void main(String args[]){
      
      int cateto1, cateto2, hipotenusa;
      
      for (cateto1 = 1; cateto1 <= 500; cateto1++){
         
         for (cateto2 = 1; cateto2 <= 500; cateto2++){
         
            for(hipotenusa = 1; hipotenusa <= 500; hipotenusa++){

               if( ( Math.pow(cateto1,2)+Math.pow(cateto2,2) ) == Math.pow(hipotenusa,2) ){
                  System.out.printf("Triangulo retangulo com catetos %d e %d e hipotenusa %d\n", cateto1, cateto2, hipotenusa);
               }               
               
            }
         }

      }
      
   }   
   
}
