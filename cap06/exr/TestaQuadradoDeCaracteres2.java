/**
* Exercicio 6.19
* Java Como Programar 6a edicao p. 200
*/
import java.util.Scanner;

public class TestaQuadradoDeCaracteres2{
   
   public static void main(String[] args){
      
      Scanner entradaTeclado = new Scanner(System.in);
      QuadradoDeCaracteres qc = new QuadradoDeCaracteres();
            
      int numero = -1;
      char c;
      
      System.out.printf("Digite um n£mero (0 para sair): ");
      numero = entradaTeclado.nextInt();
      
      while(numero != 0){
         
         System.out.printf("Digite um caracter ...........: ");
         c = entradaTeclado.next().charAt(0);
         
         qc.quadradoDeCaracteres(numero, c);         
         
         System.out.printf("Digite um n£mero (0 para sair): ");
         numero = entradaTeclado.nextInt();
         
      }
      
   }
}