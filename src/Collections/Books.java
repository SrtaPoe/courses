package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Books {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("Percy Jackson: O Ladrão de Raios");
        livros.add("Magnus Chase e os deuses de Asgard: A Espada do Verão");
        livros.add("O Hobbit");

        System.out.println(livros);
        System.out.println(livros.pop());
        System.out.println(livros);
    }
}
