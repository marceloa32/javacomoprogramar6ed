/*
* Exercicio 6.32
* Java Como Programar 6a edicao p. 202
*/
import java.util.Scanner;

public class TestaAprenderMultiplicacao3{
   
   public static void main(String[] args){
      
      Scanner entradaSistema = new Scanner(System.in);
      AprenderMultiplicacao3 aprenderMult = new AprenderMultiplicacao3(1);
      
      int resposta = 0;
      int quantos = 10;
            
      System.out.printf("Aprenda multiplica‡Æo\n\nSerÆo feitas 10 perguntas!\n\n");
      aprenderMult.novaQuestao();
      
      while ( quantos > 0 ){
         
         aprenderMult.perguntar();            
         resposta = entradaSistema.nextInt();

         if(aprenderMult.verResposta(resposta)){
            aprenderMult.novaQuestao();            
         }
         
         quantos--;
         
      }      
      
      aprenderMult.verResultado();
      
   }   
   
}