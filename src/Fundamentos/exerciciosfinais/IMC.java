package Fundamentos.exerciciosfinais;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
        double peso = dadosEntrada.nextDouble();
        System.out.print("Digite sua altura:");
        double altura = dadosEntrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC: = " + imc);


    }
}
