/**
* InitArray
* Java Como Programar 6a edicao pp. 233-4
*/
public class VetorParametros{
   
   public static void main(String args[]){
      
      if(args.length != 3){
         System.out.println("Erro. Por favor digite o comando completo, incluindo\n"+ 
                            "o tamanho do vetor, o valor inicial e o incremento.");
      } else {
         
         int tamanhoDoVetor = Integer.parseInt(args[0]);
         int vetor[] = new int[tamanhoDoVetor];
         
         int valorInicial = Integer.parseInt(args[1]);
         int incremento = Integer.parseInt(args[2]);
         
         for(int contador = 0; contador < vetor.length; contador++){
            vetor[contador] = valorInicial + incremento * contador;
         }
         
         System.out.printf("%s%8s\n", "Indice", "Valor");
         
         for(int contador = 0; contador < vetor.length; contador++){
            System.out.printf("%6d%8d\n", contador, vetor[contador] );
         }
         
      }
      
   }
   
}
