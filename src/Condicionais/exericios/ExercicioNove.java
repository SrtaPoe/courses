package Condicionais.exericios;

import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        int numeroEntrado = 0;
        int maiorNumero = 0;

        for(int i = 1; i<= 10; i++){
            System.out.print("Digite um número 0/" + i + ": ");
            int numeroEntrada = dadosEntrada.nextInt();
            numeroEntrado++;
            if(numeroEntrada > maiorNumero) maiorNumero = numeroEntrada;
        }
        System.out.println("Maior número da sequência: " + maiorNumero);
    }
}
