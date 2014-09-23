/*
* Exerc¡cio 7.17
* Java como programar 6a edicao - p. 247
*/ 
import java.util.Random;

public class FrequenciaSomaFacesDoisDados{
   
   public static void main(String[] args){
      
      Random random = new Random();
      
      int frequenciaSoma[] = new int[13]; //somas podem ser de 2 a 12
      int dado1, dado2, soma;

      //sortear 36000 vezes      
      for(int i = 1; i <= 36000; i++){
         dado1 = 1 + random.nextInt(6);
         dado2 = 1 + random.nextInt(6);
         soma = dado1+dado2;
         ++frequenciaSoma[soma];
      }

      System.out.printf("%s%12s\n", "Soma", "Frequencia");
      
      for(int sm = 2; sm < frequenciaSoma.length; sm++){
         System.out.printf("%4d%12d\n", sm, frequenciaSoma[sm] );
      }      
      
   }   
   
}
