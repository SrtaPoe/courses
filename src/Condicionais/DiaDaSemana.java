package Condicionais;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.print("Digite um dia da semana sem feira: ");
        String diaDaSemana = dadosEntrada.next();

        if(diaDaSemana.equalsIgnoreCase("Domingo")){
            System.out.println("1");
        }else if(diaDaSemana.equalsIgnoreCase("Segunda")){
            System.out.println("2");
        }else if(diaDaSemana.equalsIgnoreCase("Terça") || diaDaSemana.equalsIgnoreCase("terca")){
            System.out.println("3");
        }else if(diaDaSemana.equalsIgnoreCase("Quarta")){
            System.out.println("4");
        }else if(diaDaSemana.equalsIgnoreCase("Quinta")){
            System.out.println("5");
        }else if(diaDaSemana.equalsIgnoreCase("Sexta")){
            System.out.println("6");
        }else if(diaDaSemana.equalsIgnoreCase("Sábado") || diaDaSemana.equalsIgnoreCase("sabado")){
            System.out.println("7");
        }

        dadosEntrada.close();
    }
}
