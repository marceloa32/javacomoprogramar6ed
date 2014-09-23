/*             
* Exerc¡cio 7.18 com base no Craps da p. 178-80
* Java como programar 6a edicao - p. 247
*/ 
import java.util.Random;

public class JogoCrapsComContagem{
   
   /**
   * 1a jogada:
   * se tirar 2, 3 ou 12 perde
   * se tirar 7 ou 11 vence
   * demais valores: continua o jogo
   * se continua o jogo: 
   *  ganha quando acertar o que tirou na primeira jogada
   *  perde se sair 7
   */
   
   private Random random = new Random();
   
   private enum Status{ CONTINUAR, VITORIA, DERROTA };
   
   private final static int OLHOS_DE_COBRA = 2;
   private final static int TERNO = 3;
   private final static int SETE = 7;
   private final static int ONZE = 11;
   private final static int VAGAO = 12;
   
   private int jogadas = 0;
   private Status statusDoJogo;   
      
   public void jogar(){
      
      int pontuacao = 0; //pontuacao para continuar (se nao ganhar nem perder na 1a)
      statusDoJogo = null;
      
      jogadas = 0;      
      
      int valorObtido = jogarDados();
      jogadas++;
      
      //testa o valor do jogo no primeiro lancamento
      
      switch(valorObtido){
         
         case SETE:   //vence na 1a: com sete e onze
         case ONZE:         
            statusDoJogo = Status.VITORIA;
            break; 
         case OLHOS_DE_COBRA: //perde na 1a: com 2, 3 e 12
         case TERNO:
         case VAGAO:
            statusDoJogo = Status.DERROTA;
            break;
         default:          //demais valores: continua (acumula pontos)
            statusDoJogo = Status.CONTINUAR;
            pontuacao = valorObtido;
            System.out.printf("Pontuacao: %d\n", pontuacao);
            break;
      }
      
      while(statusDoJogo == Status.CONTINUAR){
         
         valorObtido = jogarDados();
         jogadas++;
         
         if(valorObtido == pontuacao){
            statusDoJogo = Status.VITORIA;
         } else if (valorObtido == SETE){
            statusDoJogo = Status.DERROTA;
         }
      }
      
      if(statusDoJogo == Status.VITORIA){
         System.out.printf("Jogador venceu!\n");      
         System.out.printf("Jogadas: %d\n", jogadas); 
      } else if (statusDoJogo == Status.DERROTA){
         System.out.printf("Jogador perdeu...\n");
         System.out.printf("Jogadas: %d\n", jogadas);
      }
      
   }

   //lanca os dados e obtem a soma   
   public int jogarDados(){
      
      int dado1 = 1 + random.nextInt(6);
      int dado2 = 1 + random.nextInt(6);
      
      int soma = dado1+dado2;
      
      System.out.printf("Jogador obteve %d + %d = %d\n", dado1, dado2, soma);
      
      return soma;
      
   }  
   
   
   public int getJogadas(){
      return this.jogadas;
   } 
   
   public boolean jogadorVenceu(){
      return (statusDoJogo == Status.VITORIA);
   }   
 
   
}