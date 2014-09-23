/*
* Exercicio 6.31
* Java Como Programar 6a edicao p. 201
*/
import java.util.Random;

public class AprenderMultiplicacao2{
   
   Random random;
   int resultado = -1;
   int fator1, fator2;

   
   public AprenderMultiplicacao2(){
      random = new Random();
   }

   public AprenderMultiplicacao2(long semente){
      random = new Random(semente);
   }   
   
   
   public void novaQuestao(){
      
      fator1 = 1 + random.nextInt(9);
      fator2 = 1 + random.nextInt(9);
      
      resultado = fator1*fator2;                  
      
   }
   
   public void perguntar(){
      System.out.printf("Quanto ‚ %d X %d? ", fator1, fator2);
   }
   
   
   public boolean verResposta(int resposta){
      
      if(resultado == resposta){
         System.out.printf("%s\n\n", respostaCerta());
         return true;
      } else {
         System.out.printf("%s\n\n", respostaErrada());         
      }
      
      return false;
      
   }
   
   private String respostaCerta(){
      
      int codigoResposta = 1 + random.nextInt(4);
      
      switch(codigoResposta){
         case 1:
            return "Muito bom!";
         case 2:
            return "Excelente!";
         case 3:
            return "Bom trabalho!";
         case 4:
            return "Continue o bom trabalho!";
      }      
      
      return "";
      
   }
   
   private String respostaErrada(){
      
      int codigoResposta = 1 + random.nextInt(4);
      
      switch(codigoResposta){
         case 1:
            return "NÆo. Tente de novo.";
         case 2:
            return "Errado. Tente mais uma vez.";
         case 3:
            return "NÆo desista!";
         case 4:
            return "NÆo. continue tentando.";
      }      
      
      return "";
      
   }
   
   
}
