/*
* Scope
* Java como programar 6a edicao - p. 182-3
*/
public class Escopo{
                     
   //atributo acess¡vel a todos os m‚todos                     
   private int x = 1;

   //cria vari vel local e chama m‚todos usarVariavelLocal e usarAtributo
   public void iniciar(){
      
      //vari vel local sobreia o atributo x
      int x = 5;
      
      System.out.printf("x local no metodo iniciar = %d\n", x);
      
      usarVariavelLocal();
      usarAtributo();
      usarVariavelLocal();
      usarAtributo();
      
      System.out.printf("\nx local no metodo iniciar = %d\n", x);
      
   }

   //cria uma variavel x dentro dele   
   public void usarVariavelLocal(){ 

      //apenas quando usarVAriavelLocal e chamado      
      int x = 25;
      
      System.out.printf("\nx local ao acessar o metodo usarVariavelLocal = %d\n", x);
      ++x;
      System.out.printf("\nx local antes de sair do metodo usarVariavelLocal = %d\n", x);
      
      
   }

   //modifica o atributo x da classe    
   public void usarAtributo(){
      
      System.out.printf("\natributo x ao entrar no metodo usarAtributo = %d\n", x);
      x *= 10; //modifica o atributo
      System.out.printf("\natributo x antes de sair do metodo usarAtributo = %d\n", x);
   }
   
}
