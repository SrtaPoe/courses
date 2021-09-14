package Fundamentos.desafios;

public class DesafioLogicos {
    public static void main(String[] args) {
        boolean trabalhoTerca = false;
        boolean trabalhoQuinta = false;

        boolean comprarTV50Polegadas = trabalhoTerca & trabalhoQuinta;
        boolean comprarTV32Polegas = trabalhoTerca | trabalhoQuinta && comprarTV50Polegadas!= true;
        boolean comerSorvete = comprarTV50Polegadas | comprarTV32Polegas;
        boolean saudavel = !comerSorvete;

        System.out.println("Comprar TV 50°? " + comprarTV50Polegadas);
        System.out.println("Comprar TV 32°? " + comprarTV32Polegas);
        System.out.println("Tomar sorvete°? " + comerSorvete);
        System.out.println("Saudável? " + saudavel);

        }

}

