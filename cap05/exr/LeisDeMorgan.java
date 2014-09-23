/*
* Exerc¡cios 5.23
* Java como programar 6a edicao - p. 162
*/
public class LeisDeMorgan{
   
   public static void main(String[] args){
      
      int x, y, a, b, g, i, j;

      
      System.out.println("====================\nItem a");
      
      x = 4;
      y = 8;
      System.out.printf("Para x = %d e y = %d\n", x, y);
      System.out.println("original ..: !( x < 5 ) && !( y >= 7 )");
      System.out.printf("           => %b\n",  ( !(x < 5) && !(y >= 7)) );
      System.out.println("equivalente: !( ( x < 5 ) || ( y >= 7 )");
      System.out.printf("           => %b\n",  !( ( x < 5 ) || ( y >= 7 ) ) );      
      
      x = 4;
      y = 6;
      System.out.printf("Para x = %d e y = %d\n", x, y);
      System.out.println("original ..: !( x < 5 ) && !( y >= 7 )");
      System.out.printf("           => %b\n",  ( !(x < 5) && !(y >= 7)) );
      System.out.println("equivalente: !( ( x < 5 ) || ( y >= 7 )");
      System.out.printf("           => %b\n",  !( ( x < 5 ) || ( y >= 7 ) ) );      

      x = 6;
      y = 6;
      System.out.printf("Para x = %d e y = %d\n", x, y);
      System.out.println("original ..: !( x < 5 ) && !( y >= 7 )");
      System.out.printf("           => %b\n",  ( !(x < 5) && !(y >= 7)) );
      System.out.println("equivalente: !( ( x < 5 ) || ( y >= 7 )");
      System.out.printf("           => %b\n",  !( ( x < 5 ) || ( y >= 7 ) ) );      
      
      x = 6;
      y = 8;
      System.out.printf("Para x = %d e y = %d\n", x, y);
      System.out.println("original ..: !( x < 5 ) && !( y >= 7 )");
      System.out.printf("           => %b\n",  ( !(x < 5) && !(y >= 7)) );
      System.out.println("equivalente: !( ( x < 5 ) || ( y >= 7 )");
      System.out.printf("           => %b\n",  !( ( x < 5 ) || ( y >= 7 ) ) );      


      System.out.println("====================\nItem b");
      
      a = 4;
      b = 4;
      g = 5;
      System.out.printf("Para a = %d, b = %d e g = %d\n", a, b, g);
      System.out.println("original ..: !( a == b ) || !( g != 5 )");
      System.out.printf("           => %b\n",  ( !( a == b ) || !( g != 5 ) ) );
      System.out.println("equivalente: !( (a == b ) && ( g != 5 )");
      System.out.printf("           => %b\n",  !( (a ==b ) && ( g != 5 ) ) );      
      
      a = 4;
      b = 4;
      g = 4;
      System.out.printf("Para a = %d, b = %d e g = %d\n", a, b, g);
      System.out.println("original ..: !( a == b ) || !( g != 5 )");
      System.out.printf("           => %b\n",  ( !( a == b ) || !( g != 5 ) ) );
      System.out.println("equivalente: !( (a == b ) && ( g != 5 )");
      System.out.printf("           => %b\n",  !( (a ==b ) && ( g != 5 ) ) );      
      
      a = 4;
      b = 5;
      g = 4;
      System.out.printf("Para a = %d, b = %d e g = %d\n", a, b, g);
      System.out.println("original ..: !( a == b ) || !( g != 5 )");
      System.out.printf("           => %b\n",  ( !( a == b ) || !( g != 5 ) ) );
      System.out.println("equivalente: !( (a == b ) && ( g != 5 )");
      System.out.printf("           => %b\n",  !( (a ==b ) && ( g != 5 ) ) );      
      
      
      System.out.println("====================\nItem c");
      
      x = 7;
      y = 5;
      System.out.printf("Para x = %d e y = %d\n", x, y);
      System.out.println("original ..: !( ( x <= 8 ) && ( y > 4 ) )");
      System.out.printf("           => %b\n",  !( ( x <= 8 ) && ( y > 4 ) ) );
      System.out.println("equivalente: ( !( x <= 8 ) || !( y > 4 ) ) ");
      System.out.printf("           => %b\n",  ( !( x <= 8 ) || !( y > 4 ) ) );      

      x = 7;
      y = 4;
      System.out.printf("Para x = %d e y = %d\n", x, y);
      System.out.println("original ..: !( ( x <= 8 ) && ( y > 4 ) )");
      System.out.printf("           => %b\n",  !( ( x <= 8 ) && ( y > 4 ) ) );
      System.out.println("equivalente: ( !( x <= 8 ) || !( y > 4 ) ) ");
      System.out.printf("           => %b\n",  ( !( x <= 8 ) || !( y > 4 ) ) );      

      x = 9;
      y = 5;
      System.out.printf("Para x = %d e y = %d\n", x, y);
      System.out.println("original ..: !( ( x <= 8 ) && ( y > 4 ) )");
      System.out.printf("           => %b\n",  !( ( x <= 8 ) && ( y > 4 ) ) );
      System.out.println("equivalente: ( !( x <= 8 ) || !( y > 4 ) ) ");
      System.out.printf("           => %b\n",  ( !( x <= 8 ) || !( y > 4 ) ) );      
                                                                                     
      x = 9;
      y = 4;
      System.out.printf("Para x = %d e y = %d\n", x, y);
      System.out.println("original ..: !( ( x <= 8 ) && ( y > 4 ) )");
      System.out.printf("           => %b\n",  !( ( x <= 8 ) && ( y > 4 ) ) );
      System.out.println("equivalente: ( !( x <= 8 ) || !( y > 4 ) ) ");
      System.out.printf("           => %b\n",  ( !( x <= 8 ) || !( y > 4 ) ) );                                                                                           
      
      System.out.println("====================\nItem d");      
      i = 5;
      j = 5;
      System.out.printf("Para i = %d e j = %d\n", i, j);
      System.out.println("original ..: !( ( i > 4 ) || ( j <= 6) )");
      System.out.printf("           => %b\n",  !( ( i > 4 ) || ( j < 6) ) );
      System.out.println("equivalente: ( !( i > 4 ) && !(j <= 6) ) ");
      System.out.printf("           => %b\n",  ( !(i > 4 ) && !(j <= 6) ) );
      
      i = 5;
      j = 7;
      System.out.printf("Para i = %d e j = %d\n", i, j);
      System.out.println("original ..: !( ( i > 4 ) || ( j <= 6) )");
      System.out.printf("           => %b\n",  !( ( i > 4 ) || ( j < 6) ) );
      System.out.println("equivalente: ( !( i > 4 ) && !(j <= 6) ) ");
      System.out.printf("           => %b\n",  ( !(i > 4 ) && !(j <= 6) ) );      
      
      i = 4;
      j = 5;
      System.out.printf("Para i = %d e j = %d\n", i, j);
      System.out.println("original ..: !( ( i > 4 ) || ( j <= 6) )");
      System.out.printf("           => %b\n",  !( ( i > 4 ) || ( j < 6) ) );
      System.out.println("equivalente: ( !( i > 4 ) && !(j <= 6) ) ");
      System.out.printf("           => %b\n",  ( !(i > 4 ) && !(j <= 6) ) );            
      
      i = 4;
      j = 7;
      System.out.printf("Para i = %d e j = %d\n", i, j);
      System.out.println("original ..: !( ( i > 4 ) || ( j <= 6) )");
      System.out.printf("           => %b\n",  !( ( i > 4 ) || ( j < 6) ) );
      System.out.println("equivalente: ( !( i > 4 ) && !(j <= 6) ) ");
      System.out.printf("           => %b\n",  ( !(i > 4 ) && !(j <= 6) ) );                  
   }   
   
}
