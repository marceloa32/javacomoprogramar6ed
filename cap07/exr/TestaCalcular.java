/*
* Exerc¡cio 7.14
* Java como programar 6a edicao - p. 246
*/ 
public class TestaCalcular{
   
   public static void main(String[] args){
      
      Calcular c = new Calcular();
      System.out.printf("Produto de 1 e 2: %d\n", c.calcularProduto(1, 2));
      System.out.printf("Produto de 7 e 8: %d\n", c.calcularProduto(7, 8));
      System.out.printf("Produto de 1, 2, 3, 4 e 5: %d\n", c.calcularProduto(1, 2, 3, 4, 5));
   }
}