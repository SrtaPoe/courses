package Collections;

import java.util.ArrayList;

public class Listas {

    public static void main(String[] args) {
        ArrayList<Usuario> pessoa = new ArrayList<>();

        Usuario u1 = new Usuario("Ted");

        pessoa.add(u1);
        pessoa.add(new Usuario("Marshall"));
        pessoa.add(new Usuario("Lily"));
        pessoa.add(new Usuario("Barney"));
        pessoa.add(new Usuario("Robin"));

        for(Usuario u: pessoa){
            System.out.println(u.nome);
        }

    }
}
