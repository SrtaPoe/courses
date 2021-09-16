package Condicionais.exericios;

import java.util.Scanner;

public class ExercicioUm {

    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = dadosEntrada.nextInt();

        if(numero>=0 && numero <=10 && numero % 2 == 0){
                System.out.println("O número " + numero + "  é par e " +
                        "está no intervalo de 0 a 10");
            }else if(numero <= 10 && numero % 2 == 1){
                System.out.println("O número " + numero + " não é par, mas " +
                        " está no intervalo de 0 a 10");
            }else{
            System.out.println("O número " + numero + " não é par e não" +
                    " está no intervalo de 0 a 10");
        }
        }
    }
