package Fundamentos;

import javax.swing.*;

public class Example {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite seu nome");
        double idade = Double.parseDouble(JOptionPane.showInputDialog("Digite sua idade"));

        System.out.println("Seu nome é " + nome + " " + " e possui a idade de " + idade + ".");
    }
}
