package Fundamentos;

public class VariavelConstante {
    public static void main(String[] args) {
        double raio = 3.50;
        final double PI = 3.14159;

        double areaCircunferencia = PI * (raio*raio);

        System.out.println("Area da Circuferência: " + areaCircunferencia);
    }
}
