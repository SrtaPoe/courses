package lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {

        Predicate<Livro> isCaro = book -> (book.preco * (1 - book.desconto)) >= 20;

        Livro livro = new Livro("Um dia", 25.90, 0.15);
        System.out.println(isCaro.test(livro));
    }
}
