package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = numero -> numero + 2;
        UnaryOperator<Integer> dobrando = numero -> numero * 2;
        UnaryOperator<Integer> aoQudrado = numero -> numero * numero;

       int resultado = maisDois
               .andThen(dobrando)
                       .andThen(aoQudrado)
                               .apply(0);

        System.out.println(resultado);
    }
}
