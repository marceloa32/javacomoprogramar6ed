/*
* Exercicio 6.35
* Java Como Programar 6a edicao p. 202
*/
import java.util.Random;

public class AprenderMatematica{

   public static final int MAX_OPERACAO = 5;
   public static final int MIN_OPERACAO = 1;
   public static final int MAX_NIVEL = 4;
   public static final int MIN_NIVEL = 1;
   
   private Random random;
   private int resultado = -1;
   private int numero1, numero2;
   private int acertos, erros;
   private int totalDePerguntas;    
   
   private int opcao; //1 - adicao, 2 - subtracao, 3 - multiplicacao, 4 divisao (inteira), 5 aleat¢rio
   private int operacao;  //1 - adicao, 2 - subtracao, 3 - multiplicacao, 4 divisao (inteira)
   private int nivel; //1 - 1 d°gito, 2 - 2 d°gitos. 1 a 4 para n∆o estourar =)
   
   String operador;
   
   public AprenderMatematica(int opcao, int nivel){
      random = new Random();
      this.opcao = opcao;
      this.nivel = nivel;      
   }

   public AprenderMatematica(long semente, int opcao, int nivel){
      random = new Random(semente);
      this.opcao = opcao;
      this.nivel = nivel;      
   }   
   
   
   public void novaQuestao(){
      
      //numero1 = 1 + random.nextInt(9);
      //numero2 = 1 + random.nextInt(9);
      numero1 = 1 + random.nextInt((int) Math.pow(10,nivel) - 1);
      numero2 = 1 + random.nextInt((int) Math.pow(10,nivel) - 1);      
      
      if(opcao == 5){
         operacao = 1 + random.nextInt(4);
      }

      switch(operacao){
         case 1:
            operador = "+";
            resultado = numero1 + numero2;
            break;
         case 2:
            operador = "-";
            resultado = numero1 - numero2;
            break;
         case 3:
            operador = "X";
            resultado = numero1 * numero2;
            break;
         case 4:
            operador = "/";
            resultado = numero1 / numero2;
            break;            
      }      
      
      
   }
   
   public void perguntar(){
      totalDePerguntas++;
      System.out.printf("Quanto Ç %d %s %d? ", numero1, operador, numero2);
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
            return "N∆o. Tente de novo.";
         case 2:
            return "Errado. Tente mais uma vez.";
         case 3:
            return "N∆o desista!";
         case 4:
            return "N∆o. continue tentando.";
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
         System.out.printf("\nPeáa ajuda extra ao seu instrutor!\n");
      } 
      
   }
   
   
}
