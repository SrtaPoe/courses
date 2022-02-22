package lambdas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.time.LocalDate.parse;

public class DataPalindroma {
    public static void main(String[] args) {
       Scanner dadosEntrada = new Scanner(System.in);
        System.out.println("Digite a data no formato abaixo: ");
        System.out.println("Formato desejado: 01/01/2001");
        System.out.println("Sua data: ");

        String dataRecebida = dadosEntrada.nextLine();
        String dataSemPontuacao = dataRecebida.replaceAll("\\p{Punct}", "");
        String dataCapicua = new StringBuilder(dataSemPontuacao).reverse().toString();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = parse(dataRecebida, formato);

        if(dataSemPontuacao.equals(dataCapicua)){
            System.out.println("A data passada: " + data);
            System.out.println("É uma data capícua!");
        }else{
            System.out.println("A data passada: " + data);
            System.out.println("Não é uma data capícua!");
        }

        dadosEntrada.close();

    }
}
