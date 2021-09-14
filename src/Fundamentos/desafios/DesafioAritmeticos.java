package Fundamentos.desafios;

public class DesafioAritmeticos {
    public static void main(String[] args) {
        //resolver equacoes

        int parteUm = 6 * (3+2);
        int parteDois = (1 - 5) * (2 -7) / 2;
        int parteUmPotencia = (int) Math.pow(parteUm, 2);
        int parteDoisPotencia = (int) Math.pow(parteDois, 2);

        int divisaoParteUm = parteUmPotencia / 6;

        int potenciaDivisaoParteUmDois = divisaoParteUm - parteDoisPotencia;
        int potenciaDez = (int) Math.pow(10,3);

        int resultadoParcialPotenciaUmDois = (int) Math.pow(potenciaDivisaoParteUmDois, 3);
        int resultadoFinalEquacao = resultadoParcialPotenciaUmDois / potenciaDez;

        System.out.println("Resultado da equação: " + resultadoFinalEquacao);

    }
}
