/*
* RandomIntegers
* Java como programar 6a edicao - p. 175
*/
import java.util.Random;

public class InteirosAleatorios{
   
   public static void main(String[] args){
      
      Random numerosAleatorios = new Random();
      int face; //face de um dado - 1 a 6
      
      for(int contador = 1; contador <= 20; contador++){
                                                 
         //adicionar 1 pq gera de 0 a 5                                                 
         face = 1 + numerosAleatorios.nextInt(6);
         
         System.out.printf("%d ", face);
         
         //nova linha quando o contador chegar a 5
         if(contador % 5 == 0)
            System.out.println();
         
      }
   }
}