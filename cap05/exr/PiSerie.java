/*
* Exerc¡cios 5.20
* Java como programar 6a edicao - p. 162
*/
import java.util.Scanner;

public class PiSerie{
   
   public static void main(String[] args){
                               
      int termos, termoInicial, termoFinal;                               
      int denominador;
      double pi;
      Scanner entradaTeclado = new Scanner(System.in);
      
      System.out.printf("Termo inicial (a partir de 2; -1 para sair): ");
      termoInicial = entradaTeclado.nextInt();

      
      while(termoInicial != -1){
         
         if(termoInicial <2){
            System.out.println("Numero de termos invalido!");
         } else {            

         System.out.printf("Termo final ...............................: ");
         termoFinal = entradaTeclado.nextInt();            
               
            termos = termoFinal;
            while(termos >= termoInicial){
            
               pi = 4;
               denominador = 3;            
               
               for (int i = 2; i <= termos; i++){
                  if(i % 2 == 0){
                     pi -= ((double)4 / denominador);
                  } else {
                     pi += ((double)4 / denominador);
                  }
                  //System.out.println("4/" + denominador + ": " + ((double)4/denominador) + " "+pi); //dump
                  denominador+=2;
               }            
                              
               System.out.printf("\nValor de pi para %d termos: %f", termos, pi);
               termos--;
               
            }
            
         }         
         
         System.out.printf("\nTermo inicial (a partir de 2; -1 para sair): ");
         termoInicial = entradaTeclado.nextInt();
         
      }
      
   }   
   
}
