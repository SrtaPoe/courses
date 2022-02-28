package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {
    public static void main(String[] args) {

        BinaryOperator<Double> media =
                (Double numero1, Double numero2) -> (numero1 + numero2) / 2;

        System.out.println(media.apply(10.0,10.0));

        BiFunction<Double, Double, String> resultado =
                (numero1, numero2) -> ((numero1 + numero2) / 2) >= 7 ? "Aprovado" : "Reprovado";


        System.out.println(resultado.apply(5.50,7.0));
    }
}
