/*
* Exercicio 6.30
* Java Como Programar 6a edicao p. 201
*/
import java.util.Random;

public class AprenderMultiplicacao{
   
   Random random;
   int resultado = -1;
   int fator1, fator2;

   
   public AprenderMultiplicacao(){
      random = new Random();
   }

   public AprenderMultiplicacao(long semente){
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
         System.out.printf("Muito bem!\n\n");
         return true;
      } else {
         System.out.printf("Tente mais uma vez\n\n");         
      }
      
      return false;
      
   }
   
   private String respostaCerta(){
      
      int codigoResposta = 1 + random.nextInt(4);
      
      switch(codigoResposta){
         case 1:
            return "Muito bom!";
            break;
         case 2:
            return "Excelente!";
            break;
         case 3:
            return "Bom trabalho!";
            break;
         case 4:
            return "Continue o bom trabalho";
            break;         
      }      
      
      return "";
      
   }
   
   private String respostaErrada(){
      
      int codigoResposta = 1 + random.nextInt(4);
      
      switch(codigoResposta){
         case 1:
            return "NÆo. Tente de novo.";
            break;
         case 2:
            return "Errado. Tente mais uma vez";
            break;
         case 3:
            return "Bom trabalho!";
            break;
         case 4:
            return "Continue o bom trabalho";
            break;         
      }      
      
      return "";
      
   }
   
   
}
