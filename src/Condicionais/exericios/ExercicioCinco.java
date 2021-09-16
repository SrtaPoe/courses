package Condicionais.exericios;

import java.util.Scanner;

public class ExercicioCinco {
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

        //refatorando o codigo do exercicio 4
        switch(contador){
            case 2:
                System.out.println(numero + " é primo.");
                break;
                default: System.out.println(numero + " não é primo.");
        }
        dadosEntrada.close();
    }
}


