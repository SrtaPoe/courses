package POO;

public class Livro {

        String titulo;
        String autor;
        String genero;
        String editora;
        int paginas;
        double preco;
        final static double desconto = 1.50;
        Livro(){

        }

        Livro(String tituloEntrada, String autorEntrada, String generoEntrada, String editoraEntrada,
              int paginasEntrada, double precoEntrada){
                titulo = tituloEntrada;
                autor = autorEntrada;
                genero = generoEntrada;
                editora = editoraEntrada;
                paginas = paginasEntrada;
                preco = precoEntrada;
        }

       double descontoLivro(){
               return preco - desconto;
        }

        String informacoesLivro(){
                String nomeLivro = "Nome do livro: " + titulo;
                String nomeAutor = "Nome do autor: " + autor;
                String editoraLivro = "Nome do editora: " + editora;
                String generoLivro = "Gênero: " + genero;
                String numeroPaginas =  "N° de páginas: " + paginas;
           return nomeLivro + " " + nomeAutor + " " + editoraLivro + " " +
                " " + generoLivro + " " + numeroPaginas;
        }
}
