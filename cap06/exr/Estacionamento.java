/**
* Exercicio 6.8
* Java Como Programar 6a edicao p. 199
*/
import java.util.Scanner;

public class Estacionamento{
   
   public double calcularValor(double horas){
      
      double valor = 2.0;

      if(horas>3)      
         valor+=((horas-3)*.5);      
      
      if(valor>10.0){
         valor=10.0;
      }

      return valor;      
      
   }
   
   public void controlar(){

      Scanner entradaTeclado = new Scanner(System.in);          
      
      int horas;
      double valorCliente;
      double total = 0.0;
      
      System.out.printf("Estacionamento - ontem\n\n");
      
      System.out.printf("Digite o total de horas do cliente (-1 sair): ");
      
      horas = entradaTeclado.nextInt();
      
      while (horas != -1){
         
         if(horas <= 0 || horas > 23){
            System.out.println("Quantidade de horas invalida\n");
         } else {
            
            valorCliente = calcularValor(horas);
            total += valorCliente;            
            System.out.printf("Total pago pelo cliente ...................: R$ %.2f\n", valorCliente);      
            
         }         
         
         System.out.printf("Digite o total de horas do cliente (-1 sair): ");
         horas = entradaTeclado.nextInt();         
         
      }
      
      System.out.printf("\n\nTotal de ontem: R$ %.2f", total);
      
   }
      
}
