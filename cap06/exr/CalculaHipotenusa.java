/**
* Exercicio 6.15
* Java Como Programar 6a edicao p. 200
*/
public class CalculaHipotenusa{
   
   public double hipotenusa(double cateto1, double cateto2){
      
      double hipotenusa;
      hipotenusa = Math.sqrt( Math.pow(cateto1, 2) + Math.pow(cateto2, 2) );
      
      return hipotenusa;
      
   }   
   
}
