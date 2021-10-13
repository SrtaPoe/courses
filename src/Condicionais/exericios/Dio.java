package Condicionais.exericios;

import java.util.Scanner;

public class Dio {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.print("Hora inicio: ");
        int tempoInicio = dadosEntrada.nextInt();
        System.out.print("Hora final: ");
        int tempoFinal = dadosEntrada.nextInt();
        int duracaoJogo = 24 -(24 + tempoInicio - tempoFinal) % 24;
        if(tempoInicio == tempoFinal) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }else{
            System.out.println("O JOGO DUROU " + duracaoJogo + " HORA(S)");
        }
    }
}
