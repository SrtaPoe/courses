package Condicionais;

import java.util.Scanner;

public class MediaWhile {
    public static void main(String[] args) {

        Scanner dadosEntrada = new Scanner(System.in);
        int qtdeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1){
            System.out.println("Digite uma nota ou digite -1 para Sair: ");
            nota = dadosEntrada.nextDouble();

            if(nota <= 10 && nota >= 0){
                qtdeNotas ++;
                total+= nota;
            }else if(nota != -1){
                System.out.println("Nota inválida");
            }
        }

        double media = total / qtdeNotas;
        System.out.println("Média: " + media);

        dadosEntrada.close();
    }
}
