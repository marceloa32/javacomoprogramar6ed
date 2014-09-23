/*
* Exercicio 6.29
* Java Como Programar 6a edicao p. 201
*/
import java.util.Random;

public class JogarMoeda{
   
   Random random;
   int quantosCara;
   int quantosCoroa;
   int lancamentos;
   
   public JogarMoeda(){
      random = new Random();
   }   
   
   public JogarMoeda(long semente){
      random = new Random(semente);
   }
   
   public boolean jogar(){
      
      boolean resultado = random.nextBoolean();
      
      lancamentos++;
      
      if(resultado){
         quantosCara++;
      } else {
         quantosCoroa++;
      }
      
      return resultado;   
   }
   
   
   public void mostraResultados(){

      System.out.printf("Resultados at‚ o momento\n\n");      
      System.out.printf("Lan‡amentos: %d\n", lancamentos);
      System.out.printf("Saiu cara .: %d\n", quantosCara);
      System.out.printf("Saiu coroa : %d\n", quantosCoroa);
      System.out.println();
      
      
   }   
   
}
