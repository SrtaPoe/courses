package lambdas;

public class Main {
    public static void main(String[] args) {
        Calculo mult = new Multiplicacao();
        Calculo som = new Soma();

        System.out.println(mult.executar(5,5));
        System.out.println(som.executar(5,5));
    }
}
