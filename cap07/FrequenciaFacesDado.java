/**
* RollDie
* Java Como Programar 6a edicao pp. 211
*/
import java.util.Random;

public class FrequenciaFacesDado{
   
   public static void main(String[] args){
      
      Random random = new Random();
      
      int frequencia[] = new int[7];
      
      //lanca os dados 6000 vezes e acumula a frequencia
      for(int lancamento = 1; lancamento <= 6000; lancamento++){
         ++frequencia[1 + random.nextInt(6) ];  //incrementa o item de frequencia da face do dado
      }
      
      System.out.printf("%s%10s\n", "Face", "Frequencia");
      
      for(int face = 1; face < frequencia.length; face++){
         System.out.printf("%4d%10d\n", face, frequencia[face]);
      }
         
   }
   
}
