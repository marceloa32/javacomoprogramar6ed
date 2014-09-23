/**
* Exercicio 6.20
* Java Como Programar 6a edicao p. 201
*/
import java.util.Scanner;

public class TestaCalculaArea{
   
   public static void main(String[] args){
      
      Scanner entradaTeclado = new Scanner(System.in);
      CalculaArea ca = new CalculaArea();
            
      double raio = -1;
      
      System.out.printf("Digite o raio (0 para sair): ");
      raio = entradaTeclado.nextDouble();
      
      while(raio != 0.0){         
         
         System.out.printf("Area do circulo ...........: %f\n", ca.areaDoCirculo(raio) );
         
         System.out.printf("Digite o raio (0 para sair): ");
         raio = entradaTeclado.nextDouble();
         
      }
      
   }
}