/*
* Exercicio 6.29
* Java Como Programar 6a edicao p. 201
*/
import java.util.Scanner;

public class TestaJogarMoeda{   
   
   public static void main(String[] args){
      
      JogarMoeda jm = new JogarMoeda(1);
      Scanner entradaSistema = new Scanner(System.in);
      
      int opcao = 0;
      System.out.printf("1 Jogar moeda   \n2 Ver resultados\n3 Sair          \n\nOp‡Æo: ");
      opcao = entradaSistema.nextInt();
      
      while(opcao != 3){
         
         
         switch(opcao){
            
            case 1:
               boolean resultado = jm.jogar();
               System.out.printf("Resultado: %s\n\n\n", resultado ? "cara" : "coroa" );
               break;
            
            case 2:
               jm.mostraResultados();
               break;
               
            case 3:
               break;
               
            default:
               System.out.printf("Op‡Æo inv lida\n");            
               break;              
               
         }
         
         System.out.printf("1 Jogar moeda   \n2 Ver resultados\n3 Sair          \n\nOp‡Æo: ");
         opcao = entradaSistema.nextInt();            
         
      }      
      
   }   
   
}