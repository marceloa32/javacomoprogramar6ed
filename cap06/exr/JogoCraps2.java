/*
* Craps + exerc¡cio 6.37
* Java como programar 6a edicao - p. 178-80; 202
*/
import java.util.Random;
import java.util.Scanner;

public class JogoCraps2{
   
   /**
   * 1a jogada:
   * se tirar 2, 3 ou 12 perde
   * se tirar 7 ou 11 vence
   * demais valores: continua o jogo
   * se continua o jogo: 
   *  ganha quando acertar o que tirou na primeira jogada
   *  perde se sair 7
   */
   
   private Random random;
   private Scanner entradaSistema;
   
   private enum Status{ CONTINUAR, VITORIA, DERROTA };
   
   private final static int OLHOS_DE_COBRA = 2;
   private final static int TERNO = 3;
   private final static int SETE = 7;
   private final static int ONZE = 11;
   private final static int VAGAO = 12;
   
   private double saldo = 100.0;
   private double aposta = 0.0;   
   private int pontuacao = 0; //pontuacao para continuar (se nao ganhar nem perder na 1a)
   private Status statusDoJogo;   
   public boolean temJogo = true;
   
   public JogoCraps2(){
      random = new Random();
      entradaSistema = new Scanner(System.in);
   }
   
   public void jogar(){      

      aposta = -1.0;
      int opcao = 0;
                                                       
      System.out.printf("%40s\n\n","C R A P S");
      
      System.out.printf("Saldo inicial: %1.2f\n", saldo);
      System.out.printf("Digite o valor da aposta (0 para sair): ");
      aposta = entradaSistema.nextDouble();
      
      while(aposta >0 && aposta <= saldo && temJogo){
         
         if(aposta < 0 || aposta > saldo){
            
            System.out.printf("Valor inv lido\n");
            
            System.out.printf("Digite o valor da aposta (0 para sair): \n");
            aposta = entradaSistema.nextDouble();         
            
         } else {
            
            while(temJogo ){ 
               opcao = menuJogo();
               if(opcao == 1){
                  jogada();
               } else if(opcao == 2){
                  temJogo = false;
               }
            }
         }
         
      }
      
   }
   
   public int menuJogo(){

      int opcao = 0;

      System.out.printf("Saldo: %1.2f\n", saldo);      
      System.out.printf("1. Jogar\n");
      System.out.printf("2. Sair \n");
      System.out.printf("Digite a op‡Æo: ");
      opcao = entradaSistema.nextInt();      
      return opcao;
      
   }
   
   public void jogada(){           

      
      int valorObtido = jogarDados();                     
      
      if(statusDoJogo == Status.CONTINUAR){

         if(valorObtido == pontuacao){
            statusDoJogo = Status.VITORIA;
         } else if (valorObtido == SETE){
            statusDoJogo = Status.DERROTA;
         }         
         
      } else {
      
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
      }
      
      
//      while(statusDoJogo == Status.CONTINUAR){
//         
//         valorObtido = jogarDados();
//         
//         if(valorObtido == pontuacao){
//            statusDoJogo = Status.VITORIA;
//         } else if (valorObtido == SETE){
//            statusDoJogo = Status.DERROTA;
//         }
//      }

      System.out.printf("==> %s\n", getConversa());      
      
      if(statusDoJogo == Status.VITORIA){
         System.out.println("Jogador venceu!");
         saldo+=aposta;
      } else if (statusDoJogo == Status.DERROTA){
         System.out.println("Jogador perdeu...");
         saldo-=aposta;
         if(saldo <= 0.0){
            System.out.printf("Desculpe, mas vocˆ faliu!\n");
            temJogo = false;
         }          
      } else if(statusDoJogo == Status.CONTINUAR){
         System.out.println("Continua o jogo?");         
      }

      
   }

   //lanca os dados e obtem a soma   
   public int jogarDados(){
      
      int dado1 = 1 + random.nextInt(6);
      int dado2 = 1 + random.nextInt(6);
      
      int soma = dado1+dado2;

      System.out.printf("\n----------------------------------------\n");            
      System.out.printf("Jogador obteve %d + %d = %d\n", dado1, dado2, soma);
      
      return soma;
      
   }     
   
   
   public String getConversa(){
      
      String conversa = null;
      
      int mensagem = random.nextInt(3);
         
      switch(mensagem){
         case 0:
            conversa = "Parece que vocˆ vai quebrar, hein? ";
            break;
         case 1:
            conversa = "Ah, vamos l , dˆ uma chance para sua sorte!";
            break;
         case 2:
            conversa = "Vocˆ est  montado na grana. Agora ‚ hora de trocar essas fichas e embolsar o dinheiro!";
            break;
      }
      
      return conversa;      
      
   }
   
   
}