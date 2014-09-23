/*
* MaximumFinder
* Java como programar 6a edicao - p. 168-9
*/
import java.util.Scanner;

public class PesquisadorDeMaximo{
   
   public void encontrarOMaximo(){
                          
      Scanner entradaTeclado = new Scanner(System.in);
      
      System.out.print("Digite tres numeros de ponto flutuante separados por espacos: ");
      double numero1 = entradaTeclado.nextDouble();
      double numero2 = entradaTeclado.nextDouble();
      double numero3 = entradaTeclado.nextDouble();
      
      double resultado = maximo(numero1, numero2, numero3);
      
      System.out.println("Maximo e: " + resultado);
      
   }
    
   //retorna o maior entre os 3 parametros
   public double maximo(double x, double y, double z){
      
      double valorMaximo = x;
      
      if(y > valorMaximo){
         valorMaximo = y;
      }
      
      if(z > valorMaximo){
         valorMaximo = z;
      }      
      
      return valorMaximo;
   }
   
   
}
