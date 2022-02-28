package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        Consumer<Livro> imprimir =
                l -> System.out.println(l.titulo);

        Livro l1 = new Livro("O Ladrão de Raios", 18.90, 0.08);
        Livro l2 = new Livro("O Mar de Monstros", 19.50, 0.08);
        Livro l3 = new Livro("A Maldição do Titã", 20.20, 0.08);
        Livro l4 = new Livro("A Batalha do Labirinto", 21.55, 0.08);
        Livro l5 = new Livro("O Último Olimpiano", 22.50, 0.08);

        List<Livro> livros = Arrays.asList(l1, l2, l3, l4, l5);

        livros.forEach(imprimir);
    }
}
