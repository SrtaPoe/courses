package POO.desafios;

public class DataTeste {
    public static void main(String[] args) {

        Data dataUm = new Data(12, 6, 2021);

        System.out.println(dataUm.obterDataFormada());

        Data dataDois = new Data();

        System.out.println(dataDois.obterDataFormada());
    }
}
