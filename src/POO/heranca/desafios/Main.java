package POO.heranca.desafios;

public class Main {
    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari();
        System.out.println(ferrari.velocidadeAtual);

        Civic civic = new Civic();
        System.out.println(civic.velocidadeAtual);

        //130 km
        ferrari.acelerar();
        ferrari.acelerar();
        System.out.println(ferrari.velocidadeAtual);

        //110 km
        civic.acelerar();
        civic.acelerar();
        System.out.println(civic.velocidadeAtual);

        //115 km
        ferrari.frear();
        System.out.println(ferrari.velocidadeAtual);

        //100 km
        civic.frear();
        civic.frear();
        System.out.println(civic.velocidadeAtual);
    }
}
