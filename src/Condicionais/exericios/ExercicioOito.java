package Condicionais.exericios;

import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = dadosEntrada.nextLine();
        String letra = "";

        for(int i = 0; i <= palavra.length() -1; i++){
            letra+=palavra.charAt(i);
            System.out.println(letra);
        }
    }
}
