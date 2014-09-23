/**
* GradeBookTest
* Java Como Programar 6a edicao pp. 223-4
*/
public class TestaLivroDeNotas8{
   
   public static void main(String args[]){
      
      int vetorDeNotas[] = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
      
      LivroDeNotas8 livro = new LivroDeNotas8("Introducao a programacao em Java", vetorDeNotas);
      livro.mostrarMensagem();
      livro.processarNotas();      
      
   }
}
