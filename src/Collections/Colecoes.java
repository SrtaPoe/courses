package Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Colecoes {
    public static void main(String[] args) {

       HashSet<String> herois = new HashSet<>();

       herois.add("Batman");
       herois.add("Lanterna Verde");
       herois.add("Flash");
       herois.add("Mulher-Maravilha");
       herois.add("Superman");
       herois.add("Caçador de Marte");
       herois.add("Mulher-Gavião");


        System.out.println("Tamanho do conjunto = " + herois.size());
        System.out.println(herois);

        TreeSet<String> marvel = new TreeSet<>();
        marvel.add("Homem-Aranha");
        marvel.add("Homem-de-Ferro");
        marvel.add("Capitão América");

        System.out.println(marvel);
    }
}
