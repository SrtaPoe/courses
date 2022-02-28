package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {

        List<String> aprovados = Arrays
                .asList("Bia", "Lia", "Gui");

        System.out.println("Forma tradicional...");
        for(String nome: aprovados){
            System.out.println(nome);
        }

        System.out.println("\nLambda #01...");
        aprovados.forEach((nome) -> System.out.println(nome + "!!!"));

        System.out.println("\nMethod Reference #01...");
        aprovados.forEach(System.out::println); //aqui os nomes serão lidos e apresentados na tela

        System.out.println("\nLambda #02...");
        aprovados.forEach((nome) -> meuImprimir(nome + "!!!"));

        System.out.println("\nMethod Reference #2...");
        aprovados.forEach(ForEach::meuImprimir);
    }

    //sendo usada no metodo Lambda
    public static void meuImprimir(String nome){
        System.out.println("Hi, my name is " + nome);
    }
}
