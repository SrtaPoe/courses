package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {

        Supplier<List<String>> himym =
                () -> Arrays.asList("Ted", "Lily", "Marshall", "Barney", "Robin");

        System.out.println(himym.get());
    }
}
