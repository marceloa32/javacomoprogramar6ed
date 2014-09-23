/**
* Exercicio 6.18
* Java Como Programar 6a edicao p. 200
*/
import java.util.Scanner;

public class TestaQuadradoDeCaracteres{
   
   public static void main(String[] args){
      
      Scanner entradaTeclado = new Scanner(System.in);
      QuadradoDeCaracteres qc = new QuadradoDeCaracteres();
            
      int numero = -1;
      
      System.out.printf("Digite um n£mero (0 para sair): ");
      numero = entradaTeclado.nextInt();
      
      while(numero != 0){
         
         qc.quadradoDeAsteriscos(numero);         
         
         System.out.printf("Digite um n£mero (0 para sair): ");
         numero = entradaTeclado.nextInt();
         
      }
      
   }
}