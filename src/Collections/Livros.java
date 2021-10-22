package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Livros {
    public static void main(String[] args) {

        Queue<String> books = new LinkedList<>();

        books.add("A Garota do Lago");
        books.add("Admiravel Mundo Novo");
        books.add("O Retrato de Dorian Grey");
        books.add("1984");
        books.add("O Senhor dos Aneis");

        System.out.println(books);
    }
}
