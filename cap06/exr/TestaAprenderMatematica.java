/*
* Exercicio 6.35
* Java Como Programar 6a edicao p. 202
*/
import java.util.Scanner;

public class TestaAprenderMatematica{
   
   public static void main(String[] args){
      
      Scanner entradaSistema = new Scanner(System.in);
      
      int nivel = 1;
      int operacao = 1;
      
      System.out.printf("Aprenda matem tica\n");
      
      System.out.printf("\nOpera‡Æo: (1) + (2) - (3) * (4) \\ (5) aleat¢ria (0) sair: ");
      operacao = entradaSistema.nextInt();
      
      while (operacao != 0 ){         
         
         if(operacao > AprenderMatematica.MAX_OPERACAO || operacao < AprenderMatematica.MIN_OPERACAO){
            System.out.printf("\nOperacao inv lida\n");
         } else {
         
            System.out.printf("\nN¡vel (1 a 4, 0 voltar) : ");
            nivel = entradaSistema.nextInt();
   
            while (nivel != 0) {   
            
               if(nivel > AprenderMatematica.MAX_NIVEL || nivel < AprenderMatematica.MIN_NIVEL){
                  System.out.printf("\nN¡vel inv lido\n");
               } else {
               
                  AprenderMatematica aprenderMat = new AprenderMatematica(1, operacao, nivel);
                  
                  int resposta = 0;
                  int quantos = 10;
                        
                  System.out.printf("Responda …s 10 questäes\n");
                  aprenderMat.novaQuestao();
                  
                  while ( quantos > 0 ){
                     
                     aprenderMat.perguntar();            
                     resposta = entradaSistema.nextInt();
            
                     if(aprenderMat.verResposta(resposta)){
                        aprenderMat.novaQuestao();            
                     }
                     
                     quantos--;
                     
                  }      
                  
                  aprenderMat.verResultado();
                  
               }               
                           
               System.out.printf("\nN¡vel (1 a 4, 0 voltar) : ");
               nivel = entradaSistema.nextInt();            
            
            }         
            
         }
      
         System.out.printf("\nOpera‡Æo: (1) + (2) - (3) * (4) \\ (5) aleat¢ria (0) sair: ");
         operacao = entradaSistema.nextInt();         
         
      }
      
   }   
   
}