package Fundamentos.desafios;

public class ConversorTemperaturas {
    public static void main(String[] args) {
        double temperaturaFarenheit = 86.0;
        final double celsius = 32.00;
        double operacaoConversor = 5.0/9.0;

        double conversorFahrenheitCelsius = (temperaturaFarenheit - celsius) * operacaoConversor;

        System.out.println("A temperatura em " + temperaturaFarenheit + "°F corresponde a " +
                 conversorFahrenheitCelsius + " em °C.");

    }
}
