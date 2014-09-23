/*
* LogicalOperators
* Java como programar 6a edicao - p. 146-7
*/
public class OperadoresLogicos{
   
   public static void main(String[] args){

      //&& - e condicional
      System.out.printf("%s\n%-25s: %b\n%-25s: %b\n%-25s: %b\n%-25s: %b\n\n",
         "E condicional (&&)", 
         "falso && falso", (false && false),
         "falso && verdadeiro", (false && true),
         "verdadeiro && falso", (true && false),
         "verdadeiro && verdadeiro", (true && true)  );
         
      //|| - ou condicional
      System.out.printf("%s\n%-25s: %b\n%-25s: %b\n%-25s: %b\n%-25s: %b\n\n",
         "OU condicional (||)", 
         "falso || falso", (false || false),
         "falso || verdadeiro", (false || true),
         "verdadeiro || falso", (true || false),
         "verdadeiro || verdadeiro", (true || true)  );         
         
      //& - e l¢gico booleano
      System.out.printf("%s\n%-25s: %b\n%-25s: %b\n%-25s: %b\n%-25s: %b\n\n",
         "E logico booleano (&)", 
         "falso & falso", (false & false),
         "falso & verdadeiro", (false & true),
         "verdadeiro & falso", (true & false),
         "verdadeiro & verdadeiro", (true & true)  );         
         
      //| - ou l¢gico booleano inclusivo - 
      System.out.printf("%s\n%-25s: %b\n%-25s: %b\n%-25s: %b\n%-25s: %b\n\n",
         "OU logico booleano inclusivo (|)", 
         "falso | falso", (false | false),
         "falso | verdadeiro", (false | true),
         "verdadeiro | falso", (true | false),
         "verdadeiro | verdadeiro", (true | true)  );         
         
      //^ - ou l¢gico booleano exclusivo
      System.out.printf("%s\n%-25s: %b\n%-25s: %b\n%-25s: %b\n%-25s: %b\n\n",
         "OU logico booleano exclusivo (^)", 
         "falso ^ falso", (false ^ false),
         "falso ^ verdadeiro", (false ^ true),
         "verdadeiro ^ falso", (true ^ false),
         "verdadeiro ^ verdadeiro", (true ^ true)  );         
         
      //! - negacao logica
      System.out.printf("%s\n%-25s: %b\n%-25s: %b\n\n",
         "negacao logica (!)", 
         "!falso", (!false),
         "!verdadeiro", (!true));         
      
   }
}
