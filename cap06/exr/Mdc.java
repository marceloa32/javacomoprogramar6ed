/*
* Exercicio 6.27
* Java Como Programar 6a edicao p. 201
*/
public class Mdc{
   
   public int mdc(int numero1, int numero2){
      
      int menor = (int) Math.min(numero1, numero2);      
      int contador = menor;
      int mdc = 0;
      
      while (mdc == 0 && contador >= 1){
         
         if( (numero1 % contador == 0) && (numero2 % contador == 0) ){
            mdc = contador;                                         
         }
         
         contador--;
      }
      
      return mdc;
      
      
   }   
   
}
