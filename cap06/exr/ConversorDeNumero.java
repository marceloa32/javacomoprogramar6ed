/**
* Exercicio 6.38
* Java Como Programar 6a edicao p. 202
*/
public class ConversorDeNumero{
   

   public String inteiroParaBinario(int numero){
      
      int resto = numero;
      int quo = numero;
      String resultado = "";
      
      while(quo > 0){

         quo = numero / 2;
         resto = numero % 2;                  
         numero = quo;
         resultado = "" + resto + "" + resultado;
         
      }
      
      return resultado;
   }   
   
   public String inteiroParaHexa(int numero){
      
      int resto = numero;
      int quo = numero;
      String resultado = "";
      String letra = "";
      
      while(quo > 0){

         quo = numero / 16;
         resto = numero % 16;                  
         numero = quo;
               
         
         switch (resto){
            case 10:
               letra = "A";
               break;
            case 11:
               letra = "B";
               break;
            case 12:
               letra = "C";
               break;
            case 13:
               letra = "D";
               break;
            case 14:
               letra = "E";
               break;
            case 15:
               letra = "F";
               break;
            default:
               letra = "" + resto;
               break;
         }
         
         resultado = letra + "" + resultado;
         
      }
      
      return resultado;

   }
   
   public String inteiroParaOctal(int numero){
      
      int resto = numero;
      int quo = numero;
      String resultado = "";
      
      while(quo > 0){

         quo = numero / 8;
         resto = numero % 8;                  
         numero = quo;
         resultado = "" + resto + "" + resultado;
         
      }
      
      return resultado;
   }   
}
