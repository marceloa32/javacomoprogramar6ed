/**
* Exercicio 6.6
* Java Como Programar 6a edicao p. 197
*/
import java.util.Scanner;

public class CalculaVolume{
   
   public void calcularVolume(){

      Scanner entradaTeclado = new Scanner(System.in);      
      double raio;
      
      System.out.printf("Digite o raio da esfera: ");   
      raio = entradaTeclado.nextDouble();
      
      System.out.printf("Volume ................: %f\n", volumeDaEsfera(raio) );
      
   }
   
   private double volumeDaEsfera( double raio ){
      
      double volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( raio, 3 );
      
      return volume;
   }
   
}
