package Condicionais.exericios;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = dadosEntrada.nextInt();
        int contador = 0;

        for(int i = 1; i <= numero; i++) {
            if(numero % i == 0){
                contador++;
            }
        }
        if(contador == 2){
            System.out.println(numero + " é primo");
        }else {
            System.out.println(numero + " não é primo");
        }
        dadosEntrada.close();
    }
}
