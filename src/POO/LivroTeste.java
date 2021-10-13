package POO;

public class LivroTeste {
    public static void main(String[] args) {

        Livro oneDay = new Livro();
        oneDay.titulo = "Um dia";
        oneDay.autor = "David Nicholls";
        oneDay.paginas = 320;
        oneDay.editora = "Intrínseca";
        oneDay.genero = "Drama";
        oneDay.preco = 25.80;

        System.out.println(oneDay.informacoesLivro());

        Livro miserabeles = new Livro("Os Miseráveis", "Alexandre Dumas", "Drama", "Zahar", 1200, 89.90);

        System.out.println(miserabeles.informacoesLivro());

    }
}
