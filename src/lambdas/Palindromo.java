package lambdas;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.println("Digite a palavra: ");
        String palavra = dadosEntrada.next();

        String palindromo = new StringBuilder(palavra).reverse().toString();

        if(palavra.equalsIgnoreCase(palindromo)){
            System.out.println("A palavra " + palavra + " é palíndroma!");
        }else{
            System.out.println("A palavra " + palavra + " não é palíndroma!");
        }
        dadosEntrada.close();
    }

}
