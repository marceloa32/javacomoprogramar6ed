/**
* GradeBookTest
* Java Como Programar 6a edicao pp. 231
*/
public class TestaLivroDeNotas9{
   
   public static void main(String[] args){
      
      int matrizDeNotas[][] = { { 87,  96,  70}, 
                                { 68,  87,  90},
                                { 94, 100,  90},
                                {100,  81,  82},
                                { 83,  65,  85},
                                { 78,  87,  65}, 
                                { 85,  75,  83},
                                { 91,  94, 100},
                                { 76,  72,  84},
                                { 87,  93,  73} };
      
      LivroDeNotas9 livro = new LivroDeNotas9("Introducao a programacao em Java", matrizDeNotas);
      
      livro.mostrarMensagem();
      livro.processarNotas();
      
   }   
   
}
