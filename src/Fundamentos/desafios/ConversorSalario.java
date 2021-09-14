package Fundamentos.desafios;

import java.util.Scanner;

public class ConversorSalario {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.print("Digite seu salário de janeiro: ");
        String salarioJaneiro = dadosEntrada.nextLine().replace(",", ".");
        System.out.print("Digite seu salário de fevereiro: ");
        String salarioFevereiro = dadosEntrada.nextLine().replace(",", ".");
        System.out.print("Digite seu salário de março: ");
        String salarioMarco = dadosEntrada.nextLine().replace(",", ".");

        double salarioJan = Double.parseDouble(salarioJaneiro);
        double salarioFev = Double.parseDouble(salarioFevereiro);
        double salarioMar = Double.parseDouble(salarioMarco);

        double media = (salarioJan + salarioFev + salarioMar) / 3;
        System.out.println("A média salarial do 1° trimestre: " + media);

        dadosEntrada.close();

    }
}
