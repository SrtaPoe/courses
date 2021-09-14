package Fundamentos.exerciciosfinais;

import java.util.Scanner;

public class EquacaoBhaskara {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.print("Digite o valor de a: ");
        double a = dadosEntrada.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b = dadosEntrada.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c = dadosEntrada.nextDouble();

        double deltaB = Math.pow(b, 2);
        double delta = deltaB - (4 * a * c);

        double xPositivo = (- b + Math.sqrt(delta)) / (2 * a);
        double xNegativo = (- b - (Math.sqrt(delta)) / (2 * a));

        System.out.printf("X1: %.2f " , xPositivo);
        System.out.printf("X2: %.2f" , xNegativo);

    }
}
