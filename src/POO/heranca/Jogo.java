package POO.heranca;

public class Jogo {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador();
        jogador1.setX(10);
        jogador1.setY(10);

        Jogador jogador2 = new Jogador();
        jogador2.setX(10);
        jogador2.setY(11);

        System.out.println(jogador1.getVida());
        System.out.println(jogador2.getVida());

        jogador1.atacar(jogador2);
        jogador2.atacar(jogador1);

        System.out.println(jogador1.getVida());
        System.out.println(jogador2.getVida());
    }
}
