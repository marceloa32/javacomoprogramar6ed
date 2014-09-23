/*
* Exercicio 6.23
* Java Como Programar 6a edicao p. 201
*/  
import java.util.Scanner;

public class TestaCalculaMinimo{
   
   public static void main(String[] args){
      
      Scanner entradaSistema = new Scanner(System.in);
      
      double numero1 = 0.0;
      double numero2 = 0.0;
      double numero3 = 0.0;
      
      System.out.printf("Digite 3 numeros de ponto flutuante (CTRL+Z finaliza): ");

      int contador = 1;      
      double numero = 0.0;
      
      while(entradaSistema.hasNext()){         
         
         if(contador == 1){
            numero1 = entradaSistema.nextDouble();
         } else if (contador == 2){
            numero2 = entradaSistema.nextDouble();
         } else {
            numero3 = entradaSistema.nextDouble();
         }
         
         contador++;
      }    
      
      CalculaMinimo cm = new CalculaMinimo();
      
      System.out.printf("\nO menor e' %f", cm.minimoDe3(numero1, numero2, numero3));
      
      
   }   
   
}
