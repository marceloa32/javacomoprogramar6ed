/**
* Exercicio 6.17
* Java Como Programar 6a edicao p. 200
*/
import java.util.Scanner;

public class TestaVerificaPar{
   
   public static void main(String[] args){
      
      Scanner entradaTeclado = new Scanner(System.in);
      VerificaPar vp = new VerificaPar();
            
      int numero = 0;
      
      System.out.printf("Digite um n£mero (-1 para sair): ");
      numero = entradaTeclado.nextInt();
      
      while(numero != -1){
         
         System.out.printf("%d e' %s\n", numero, (vp.isPar(numero) ? "par" : "impar") );   
         
         System.out.printf("Digite um n£mero (-1 para sair): ");
         numero = entradaTeclado.nextInt();
         
      }
      
   }
}