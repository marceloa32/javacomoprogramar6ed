/**
* Card
* Java Como Programar 6a edicao pp. 213
*/
public class Carta{
   
   private String valor;
   private String naipe;
   
   public Carta( String valor, String naipe){
      this.valor = valor;
      this.naipe = naipe;
   }
   
   public String toString(){
      return valor + " de " + naipe;
   }
}
