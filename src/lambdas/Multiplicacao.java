package lambdas;

public class Multiplicacao implements Calculo{

    @Override
    public double executar(double numeroUm, double numeroDois) {
        return numeroUm * numeroDois;
    }
}
