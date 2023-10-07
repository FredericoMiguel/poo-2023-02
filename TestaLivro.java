



public class TestaLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("The Da Vince Code", "Dan Brown", 2003, "Corgi Books");
        
        System.out.println(livro1.toString() + "\n");
        
        Livro livro2 = new Livro("O homem mais rico da Babilônia", "George Samuel Clason", 1926, "Penguin Books");
        
        System.out.println(livro2.toString() + "\n");
        
        Livro livro3 = new Livro("A Garota do lago", "Charlie Donlea", 2016, "Faro Editorial");
        
        System.out.println(livro3.toString());
        
    }

    
}