package POO.polimorfismo;

public class Almoco {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(72.90, "Pedro");
        System.out.println("Peso antes comer: " +pessoa1.getPeso());


        Arroz ingrediente1 = new Arroz(0.25, "Tio Jorge");
        pessoa1.comer(ingrediente1);
        Feijao ingrediente2 = new Feijao(0.180, "Tio João");
        pessoa1.comer(ingrediente2);
        Sorvete ingrediente3 = new Sorvete(0.150, "Kibon");
        pessoa1.comer(ingrediente3);

        System.out.println("Peso após comer: " + pessoa1.getPeso());
    }
}
