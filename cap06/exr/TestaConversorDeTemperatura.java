/*
* Exercicio 6.21
* Java Como Programar 6a edicao p. 201
*/
import java.util.Scanner;

public class TestaConversorDeTemperatura{   
   
   public static void main(String[] args){
      
      ConversorDeTemperatura cdt = new ConversorDeTemperatura();
      Scanner entradaSistema = new Scanner(System.in);
      
      int tipo = 0, tempConvertida;
      double temperatura;          
      
      System.out.printf("Tipo da temperatura a converter (1 F, 2 C, 0 Sair): ");
      tipo = entradaSistema.nextInt();
      
      while (tipo != 0){
         
         if(tipo < 1 || tipo > 2){
            System.out.println("Tipo inv lido");
         } else {
            System.out.printf("Temperatura em ø%s ................................: ", (tipo == 1 ? "F" : "C") );
            temperatura = entradaSistema.nextDouble();            
            
            if(tipo == 1){
               
               tempConvertida = cdt.fParaC(temperatura);               
               System.out.printf("Temperatura em ø%s ................................: %d\n", (tipo == 1 ? "C" : "F"),  tempConvertida);
               
            } else {

               tempConvertida = cdt.cParaF(temperatura);               
               System.out.printf("Temperatura em ø%s ................................: %d\n", (tipo == 1 ? "C" : "F"),  tempConvertida);               
               
            }           
            
         }
         
         System.out.printf("\nTipo da temperatura a converter (1 F, 2 C, 0 Sair): ");
         tipo = entradaSistema.nextInt();         
         
         
      }
      
   }  
   
   
}
