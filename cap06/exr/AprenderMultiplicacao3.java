/*
* Exercicio 6.32
* Java Como Programar 6a edicao p. 202
*/
import java.util.Random;

public class AprenderMultiplicacao3{
   
   Random random;
   int resultado = -1;
   int fator1, fator2;
   int acertos, erros;
   int totalDePerguntas;

   
   public AprenderMultiplicacao3(){
      random = new Random();
   }

   public AprenderMultiplicacao3(long semente){
      random = new Random(semente);
   }   
   
   
   public void novaQuestao(){
      
      fator1 = 1 + random.nextInt(9);
      fator2 = 1 + random.nextInt(9);
      
      resultado = fator1*fator2;                  
      
   }
   
   public void perguntar(){
      totalDePerguntas++;
      System.out.printf("Quanto ‚ %d X %d? ", fator1, fator2);
   }
   
   
   public boolean verResposta(int resposta){
      
      if(resultado == resposta){
         System.out.printf("%s\n\n", respostaCerta());
         acertos++;
         return true;
      } else {
         System.out.printf("%s\n\n", respostaErrada());         
         erros++;
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
   
   public void verResultado(){
      
      double percentual = (acertos * 100) / totalDePerguntas;
      
      System.out.printf("Total do aluno\n");
      System.out.printf("Acertos ......: %d\n", acertos);
      System.out.printf("Erros ........: %d\n", erros);        
      
      System.out.printf("%% de acertos .: %.2f\n", percentual);
      if ( percentual < 75){
         System.out.printf("\nPe‡a ajuda extra ao seu instrutor!\n");
      } 
      
   }
   
   
}
