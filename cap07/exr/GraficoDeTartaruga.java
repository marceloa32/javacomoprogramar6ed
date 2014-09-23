/*
* Exerc¡cio 7.21
* Java como programar 6a edicao - p. 247-8
*/ 
import java.util.Scanner;

public class GraficoDeTartaruga{

   private int chao[][];
   
   private boolean canetaNoPapel;
   private boolean paraDireita; 
   private int posicaoAtual[][];
   Scanner scannerTeclado ;
   
   public GraficoDeTartaruga(){
      chao = new int[20][20];
      scannerTeclado = new Scanner(System.in);
      posicaoAtual = new int[1][1];
      canetaNoPapel = false;
      paraDireita = true;
   }   
   
   public void lerInstrucoes(){
      
      int opcao = 0;
      int quant = 0;
      
      System.out.printf("Grafico de tartaruga\n\n");
      System.out.printf("Lista de comandos: \n");
      System.out.printf("1 - Caneta levantada\n");
      System.out.printf("2 - Caneta no papel\n");
      System.out.printf("3 - Virar para direita\n");
      System.out.printf("4 - Virar para a esquerda\n");
      System.out.printf("5 - Avancar n espacos\n");
      System.out.printf("6 - Mostrar desenho\n");
      System.out.printf("9 - Encerrar\n\n");
      
      System.out.printf("Digite os comando: ");
      opcao = scannerTeclado.nextInt();
      
      while(opcao != 9){
         
         if(opcao == 5){
            System.out.printf("Digite a quantidade de espacos: ");
            quant = scannerTeclado.nextInt();            
            
            while(quant < 0){
               System.out.printf("> Quantidade invalida\n");
               System.out.printf("Digite a quantidade de espacos: ");
               quant = scannerTeclado.nextInt();                           
            }
         }        
         
         switch(opcao){
            case 1:
               canetaNoPapel = false;
               break;
            case 2:
               canetaNoPapel = true;
               break;
            case 3:
               paraDireita = true;
               break;   
            case 4:
               paraDireita = false;
               break;
            case 5:
               moverTartaruga(quant);
               break;      
            case 6:
               mostrarChao();
               break;
            case 9:
            default:
               System.out.printf("> Opcao invalida");
               break;
         }
         
         
         System.out.printf("Digite os comando: ");
         quant = 0;
         opcao = scannerTeclado.nextInt();         
      }
      
   };
   
   private void moverTartaruga(int quant){

      int xmax = posicaoAtual[0][0];
      int ymax = posicaoAtual[0][1];
      
            
         
   }
   
   
   
   private void mostrarChao(){
      
      for(int i = 0; i < chao.length; i++){
         
         for(int j = 0; j < chao[i].length; j++){
            
            if(chao[i][j] == 1){
               System.out.printf("*");
            } else {
               System.out.printf(" ");
            }
         }
         
         System.out.printf("\n");
         
      }      
      
   }
   
   
   
   
}