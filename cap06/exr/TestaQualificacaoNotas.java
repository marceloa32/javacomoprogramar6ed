/*
* Exercicio 6.28
* Java Como Programar 6a edicao p. 201
*/
import java.util.Scanner;

public class TestaQualificacaoNotas{
   
   public static void main(String[] args){
      
      Scanner entradaSistema = new Scanner(System.in);
      QualificacaoNotas qn = new QualificacaoNotas();
      
      int nota = 0;
      
      System.out.printf("Nota (0 a 100, inteiro; -1 para sair): ");
      nota = entradaSistema.nextInt();
      
      while( nota != -1){

         if(nota > 100 || nota < -1){
            System.out.printf("Nota inv lida\n");            
         } else {
            System.out.printf("Sua qualifica‡Æo ....................: %d\n", qn.pontosDeQualificacao(nota));
         }
         
         System.out.printf("Digite a nota (inteiro; -1 para sair): ");
         nota = entradaSistema.nextInt();
         
      }
      
   }   
   
}
