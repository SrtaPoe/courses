package Condicionais.exericios;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.print("Digite a primeira nota parcial: ");
        double notaUmParcial = dadosEntrada.nextDouble();
        System.out.print("Digite a segunda nota parcial: ");
        double notaDoisParcial = dadosEntrada.nextDouble();

        double media = (notaUmParcial + notaDoisParcial) / 2;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media > 4) {
            System.out.println("Em recuperação");
        } else {
            System.out.println("Reprovado");
        }
        dadosEntrada.close();
    }
}
