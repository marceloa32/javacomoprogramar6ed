/*
* Exercicio 6.21
* Java Como Programar 6a edicao p. 201
*/
public class ConversorDeTemperatura{
   
   public int fParaC(double f){
      return (int)(5.0 / 9.0 * (f - 32));
   }
   
   public int cParaF(double c){
      return (int) (9.0 / 5.0 * c + 32);
   }
}