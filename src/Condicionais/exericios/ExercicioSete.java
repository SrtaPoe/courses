package Condicionais.exericios;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = dadosEntrada.nextInt();
        int somaPositivos = 0;

        while(numero > 0){
            somaPositivos += numero;
            System.out.println("A soma dos números inseridos é: " + somaPositivos);
            numero++;
            if(numero > 0){
                System.out.print("Digite mais número: ");
                numero = dadosEntrada.nextInt();
            }else{
                break;
            }
        }
    }
}
