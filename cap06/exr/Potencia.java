/**
* Exercicio 6.14
* Java Como Programar 6a edicao p. 200
*/

public class Potencia{
   
   public int potenciaDeInteiro(int base, int expoente){

      int resultado = 1;
             
      while(expoente > 0){
         resultado *= base;
         expoente--;
      }            
       
      return resultado;
      
   }
   
}
