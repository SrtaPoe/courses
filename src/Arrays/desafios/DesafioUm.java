package Arrays.desafios;

import java.util.Scanner;

public class DesafioUm {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        //informar a quantidade de notas e média dessas notas
        System.out.println("Digite a quantidade de notas a serem usadas: ");
        int qtdeNotas = dadosEntrada.nextInt();
        double somaNotas = 0;


        double[] notas = new double[qtdeNotas];
        double notaEntrada;

        for (int i =0; i<qtdeNotas; i++) {
            System.out.println("Digite a nota: ");
            notaEntrada = dadosEntrada.nextDouble();
            notas[i] = notaEntrada;
        }

        double media = 0;
        System.out.println("Notas repassadas:");
        for (double nota : notas) {
            somaNotas = somaNotas + nota;
            media = somaNotas / notas.length;
        }


        System.out.println("Media: " + media);


    }
}
