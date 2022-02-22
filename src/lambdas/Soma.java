package lambdas;

public class Soma  implements Calculo{
    @Override
    public double executar(double numeroUm, double numeroDois) {
        return numeroUm + numeroDois;
    }
}
