package Fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = dadosEntrada.nextInt();
        System.out.print("Digite o segundo número: ");
        int segundoNumero = dadosEntrada.nextInt();

        System.out.println("-------------------------------------------------------------");
        System.out.println("Por favor escolha uma operação e digite o símbolo correspondente");
        System.out.println(
                "SOMA: +  | SUBTRAÇÃO: - | MULTIPLICAÇÃO: * | DIVISÃO: / | MÓDULO: %");
        System.out.println("Digite aqui sua operação escolhida: ");
        String operador = dadosEntrada.next();
        System.out.println("------------------------------------------------------------");


        int adicao = primeiroNumero + segundoNumero;
        int subtracao = primeiroNumero - segundoNumero;
        int multi = primeiroNumero * segundoNumero;
        int divisao = primeiroNumero / segundoNumero;
        int modulo = primeiroNumero % segundoNumero;

        System.out.println(
                operador.equals("+") ? "Resultado: " + adicao : operador.equals("*")? "Resultado: " + multi : operador.equals("/")? "Resultado: " + divisao :
                operador.equals("-") ? "Resultado: " + subtracao : operador.equals("%")? "Resultado: " + modulo : "Operação inválida");

        dadosEntrada.close();

    }
}
