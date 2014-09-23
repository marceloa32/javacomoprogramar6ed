/*
* MethodOverload
* Java como programar 6a edicao - p. 184
*/
public class SobrecargaDeMetodo{
   
   public void testarSobrecargaDeMetodo(){
      
      System.out.printf("Quadrado de 7 (integer) = %d\n", aoQuadrado(7) );
      System.out.printf("Quadrado de 7,5 (double) = %f\n", aoQuadrado(7.5) );
   }
   
   public int aoQuadrado(int valor){
      
      System.out.printf("\naoQuadrado chamado com argumento inteiro: %d\n", valor);
      return valor*valor;
   }
   
   public double aoQuadrado(double valor){
      
      System.out.printf("\naoQuadrado chamado com argumento double: %f\n", valor);
      return valor*valor;
   }
   
}
