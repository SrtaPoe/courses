package Condicionais.exericios;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.print("Digite o ano a ser consultado: ");
        int ano = dadosEntrada.nextInt();
        //saber se um ano é bisssexto

        if(ano % 4 == 0 && ano % 100 != 0){
            System.out.print(ano + " ");
            System.out.print("é bissexto");
        }else if(ano % 4 == 0 || ano % 400 == 0){
            System.out.print(ano + ": ");
            System.out.print("é bissexto");
        }else{
            System.out.print(ano + " ");
            System.out.print("não é bissexto");
        }
    }
}
