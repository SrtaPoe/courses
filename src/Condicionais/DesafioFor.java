package Condicionais;

import java.util.Scanner;

public class DesafioFor {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int contador = dadosEntrada.nextInt();
        String simbolo = "*";

        for(int i = 0; i <= contador ; i++){
            System.out.println(simbolo);
            simbolo += "*";
        }

    }
}
