/*
* Exercicio 6.31
* Java Como Programar 6a edicao p. 201
*/
import java.util.Scanner;

public class TestaAprenderMultiplicacao2{
   
   public static void main(String[] args){
      
      Scanner entradaSistema = new Scanner(System.in);
      AprenderMultiplicacao2 aprenderMult = new AprenderMultiplicacao2(1);
      
      int resposta = 0;
            
      System.out.printf("Aprenda multiplica��o\n\nResponda -1 para sair\n\n");
      aprenderMult.novaQuestao();
      
      while ( (resposta != -1) ){
         
         aprenderMult.perguntar();            
         resposta = entradaSistema.nextInt();

         if(resposta != -1){                               
            if(aprenderMult.verResposta(resposta)){
               aprenderMult.novaQuestao();            
            }         
         }         
         
      }      
      
   }   
   
}