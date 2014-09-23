/**
* Exercicios 6.7, 6.12, 6.13
* Java Como Programar 6a edicao p. 199, 200, 200
*/
import java.util.Random;

public class OutrosExercicios{
   
   public static void main(String[] args){

      //6.7      
      double x;
   
      x = Math.abs(7.5);      
      System.out.printf("%f\n\n", x);
      
      x = Math.floor(7.5);      
      System.out.printf("%f\n\n", x);      
      
      x = Math.abs(0.0);      
      System.out.printf("%f\n\n", x);            
      
      x = Math.ceil(0.0);      
      System.out.printf("%f\n\n", x);
      
      x = Math.abs(-6.4);      
      System.out.printf("%f\n\n", x);      
      
      x = Math.ceil(-6.4);      
      System.out.printf("%f\n\n", x);
      
      x = Math.ceil(-Math.abs( -8 + Math.floor(-5.5) ) );      
      System.out.printf("%f\n\n", x);      
      
      //6.12 a
      System.out.println("\n");           
      Random random = new Random(); 
      
      String resultado = "";
      int n;

      System.out.printf("1 <= n <= 2\n");
      n = 1 + random.nextInt(2);

      resultado = ((n >= 1 && n <=2) ? "ok" : "erro" );
      System.out.printf("1 <= %d <= 2  %s", n, resultado);    
        
      
      //6.12 b
      System.out.println("\n");
      
      System.out.printf("1 <= n <= 100\n");
      n = 1 + random.nextInt(100);

      resultado = ((n >= 1 && n <=100) ? "ok" : "erro" );
      System.out.printf("1 <= %d <= 100  %s", n, resultado);          
      
      //6.12 c
      System.out.println("\n");
      
      System.out.printf("0 <= n <= 9\n");
      n = random.nextInt(10);

      resultado = ((n >= 0 && n <=9) ? "ok" : "erro" );
      System.out.printf("0 <= %d <= 9  %s", n, resultado);                      
      
      //6.12 d
      System.out.println("\n");
      
      System.out.printf("1000 <= n <= 1112\n");
      n = 1000 + random.nextInt(113);

      resultado = ((n >= 1000 && n <=1112) ? "ok" : "erro" );
      System.out.printf("1000 <= %d <= 1112  %s", n, resultado);                      

      //6.12 e
      System.out.println("\n");
      
      System.out.printf("-1 <= n <= 1\n");
      n = -1 + random.nextInt(3);

      resultado = ((n >= -1 && n <= 1) ? "ok" : "erro" );
      System.out.printf("-1 <= %d <= 1  %s", n, resultado);                      
      
      //6.12 e
      System.out.println("\n");
      
      System.out.printf("-3 <= n <= 11\n");
      n = -3 + random.nextInt(15);

      resultado = ((n >= -3 && n <= 11) ? "ok" : "erro" );
      System.out.printf("-3 <= %d <= 11  %s", n, resultado);                      

      //6.13 a
      System.out.println("\n");
      
      n = 2 + 2 * random.nextInt(5);
      System.out.printf("%d", n);
      
      //6.13 b
      System.out.println("\n");
      
      n = 3 + 2 * random.nextInt(5);
      System.out.printf("%d", n);
      
      //6.13 c
      System.out.println("\n");
      
      n = 6 + 4 * random.nextInt(5);
      System.out.printf("%d", n);      
      
   }   
   
}
