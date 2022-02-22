package lambdas;

public class CalculoMain {
    public static void main(String[] args) {

        //uso de lambda
        Calculo calc = (numero1, numero2) -> {return numero1 * numero2;};
        System.out.println(calc.executar(5,5));
    }
}
