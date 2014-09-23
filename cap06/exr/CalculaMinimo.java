/*
* Exercicio 6.23
* Java Como Programar 6a edicao p. 201
*/
public class CalculaMinimo{
   
   public double minimoDe3(double numero1, double numero2, double numero3){
      
      double minimo = numero1;
      
      minimo = Math.min(minimo, numero2);
      minimo = Math.min(minimo, numero3);
      
      return minimo;
   }   
   
}
