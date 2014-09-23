/*
* Exerc¡cios 5.29
* Java como programar 6a edicao - p. 163
*/
public class DozeDiasDeNatalTraduzida{   
   
   public static void main(String args[]){
       
      String dia="";
      String coisas = "";
             
      for(int d = 1; d <= 12; d++){

         
         switch(d){
            case 1:
               dia = "primeiro"; 
            break;
            
            case 2:
               dia = "segundo";               
            break;
            
            case 3:
               dia = "terceiro"; 
            break;
            
            case 4:
               dia = "quarto";               
            break;            
            
            case 5:
               dia = "quinto"; 
            break;
            
            case 6:
               dia = "sexto";               
            break;
            
            case 7:
               dia = "setimo"; 
            break;
            
            case 8:
               dia = "oitavo";               
            break;
            
            case 9:
               dia = "nono"; 
            break;
            
            case 10:
               dia = "decimo";               
            break;
            
            case 11:
               dia = "decimo-primeiro"; 
            break;
            
            case 12:
               dia = "decimo-segundo";               
            break;                        
         }   
               
         coisas="";
         switch(d){
            
            case 12:
               coisas+="12 tocadores de tambor, \n";
            case 11:
               coisas+="11 flautistas tocando, \n";
            case 10:
               coisas+="10 lordes saltando, \n";
            case 9:
               coisas+="9 senhoras dancando, \n";
            case 8:
               coisas+="8 servas ordenhando, \n";
            case 7:
               coisas+="7 cisnes nadando, \n";
            case 6:
               coisas+="6 gansos chocando, \n";
            case 5:
               coisas+="5 aneis dourados, \n";
            case 4:
               coisas+="4 passaros cantando, \n";
            case 3:
               coisas+="3 galinhas francesas, \n";
            case 2:
               coisas+="2 pombas-rolas\n";
            case 1:
               if(d > 1){
                  coisas+=" e ";
               }
               coisas+="uma perdiz numa pereira";             
            break;
         }
         
         System.out.printf("No %s dia de Natal o meu amor me enviou \n%s\n\n", dia, coisas);
         
      }
      
      
   }
   
}
