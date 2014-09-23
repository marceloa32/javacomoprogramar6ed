/**
* Exercicio 6.10
* Java Como Programar 6a edicao p. 199
*/
import java.util.Scanner;

public class Arredondar{
   
   public void calcular(){
      
      double numero;
      Scanner entradaTeclado = new Scanner(System.in);
      
      System.out.printf("Digite numero para arredondar (0 p/ sair): ");
      numero = entradaTeclado.nextDouble();
      
      while (numero != 0.0){
         
         System.out.printf("%15s\t%15s\t%15s\t%15s\t%15s\n", "Original", "Inteiro", "Decimos", "Centesimos", "Milesismos");
         System.out.printf("%10.4f\t%10.4f\t%10.4f\t%10.4f\t%10.4f\n", numero,
                                                      arredondarParaInteiro(numero),
                                                      arredondarAteDecimos(numero),
                                                      arredondarAteCentesimos(numero),
                                                      arredondarAteMilesimos(numero));
                                                      
         System.out.printf("Digite numero para arredondar (0 p/ sair): ");
         numero = entradaTeclado.nextDouble();                                                      
                                                      
         
      }
      
   }
   
   public double arredondarParaInteiro(double numero){
      
      double resultado;
      
      resultado = Math.floor(numero + 0.5);
      
      return resultado;
      
   }
   
   public double arredondarAteDecimos(double numero){
      double resultado;
      
      resultado = Math.floor(numero * 10 + 0.5) / 10;
      
      return resultado;
   }
   
   public double arredondarAteCentesimos(double numero){
      
      double resultado;
      
      resultado = Math.floor(numero * 100 + 0.5) / 100;
      
      return resultado;      
   }
   
   public double arredondarAteMilesimos(double numero){

      
      double resultado;
      
      resultado = Math.floor(numero * 1000 + 0.5) / 1000;
      
      return resultado;         
      
   }
   
   public static void main(String[] args){
      
      Arredondar arr = new Arredondar();
      arr.calcular();
   }
   
}