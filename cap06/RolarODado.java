/*
* RollDie
* Java como programar 6a edicao - p. 176-7
*/
import java.util.Random;

public class RolarODado{
   
   public static void main(String[] args){
      
      Random numerosAleatorios = new Random();
      
      int frequenciaDo1 = 0;
      int frequenciaDo2 = 0;
      int frequenciaDo3 = 0;
      int frequenciaDo4 = 0;
      int frequenciaDo5 = 0;
      int frequenciaDo6 = 0;
      
      int face;  //face de um dado
      
      for(int rolagem = 1; rolagem <= 6000; rolagem++){
         
         face = 1 + numerosAleatorios.nextInt(6); //gera de 0 a 5; somar 1 para obter de 1 a 6
         
         switch(face){
            
            case 1:
               ++frequenciaDo1;
               break;
            case 2:
               ++frequenciaDo2;
               break;
            case 3:
               ++frequenciaDo3;
               break;
            case 4:
               ++frequenciaDo4;
               break;
            case 5:
               ++frequenciaDo5;
               break;
            case 6:
               ++frequenciaDo6;
               break;                              
         }
         
      } //for
      
      System.out.println("Face\tFrequencia");
      System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n", frequenciaDo1,
                                                                      frequenciaDo2,
                                                                      frequenciaDo3,
                                                                      frequenciaDo4,
                                                                      frequenciaDo5,
                                                                      frequenciaDo6);      
      
   }
   
}
