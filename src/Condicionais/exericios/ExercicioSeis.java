package Condicionais.exericios;

import java.util.Random;
import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {

        Scanner dadosEntrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numeroDoJogador = dadosEntrada.nextInt();

        Random random = new Random();
        int numeroDaJogada = random.nextInt(100);
        System.out.println("numero da rodada: " + numeroDaJogada);

        int qtdeTentativas = 10;

        while(numeroDoJogador != numeroDaJogada && qtdeTentativas >0 ){
            --qtdeTentativas;
            System.out.println("Quantidade de tentativas restantes: " + qtdeTentativas);
            if(numeroDoJogador > numeroDaJogada){
                System.out.println("O número inserido é maior do que o do jogo");
            } else {
                System.out.println("O número inserido é menor do que o do jogo");
            }
            System.out.print("Digite mais um número: ");
            numeroDoJogador = dadosEntrada.nextInt();
            if(numeroDoJogador == numeroDaJogada){
                System.out.println("Você ganhouuuuu!");
                break;
            }else if(qtdeTentativas == 0){
                System.out.println("Você perdeu!");
            }

        }
        dadosEntrada.close();
    }
}
