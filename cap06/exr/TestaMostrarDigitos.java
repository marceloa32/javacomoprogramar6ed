/**
* Exercicio 6.20
* Java Como Programar 6a edicao p. 201
*/
import java.util.Scanner;

public class TestaMostrarDigitos{
   
   public static void main(String[] args){
      
      Scanner entradaTeclado = new Scanner(System.in);
      Digitos digitos = new Digitos();
            
      int numero  = -1;
      
      System.out.printf("Digite um numero (0 para sair): ");
      numero = entradaTeclado.nextInt();
      
      while(numero != 0){         
         
         if(numero >= 1 && numero <= 99999){
            digitos.mostrarDigitos(numero);
         } else {
            System.out.println("Numero invalido. Digite um valor entre 1 e 99999");
         }
         
         System.out.printf("\nDigite um numero (0 para sair): ");
         numero = entradaTeclado.nextInt();
         
      }
      
   }
}