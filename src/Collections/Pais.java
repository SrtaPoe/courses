package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Pais {
    public static void main(String[] args) {

        Map<String, String> paises = new HashMap<>();

        paises.put("Brasil", "Brasília");
        paises.put("Rússia", "Moscou");
        paises.put("Argentina", "Buenos Aires");
        paises.put("França", "Paris");


        System.out.println(paises.entrySet());

        //por chave
        for(String chave: paises.keySet()) {
            System.out.println(chave);
        }

        //por valor
        for(String valor: paises.values()) {
            System.out.println(valor);
        }

        //por entry(pelos dois)
        for(Entry<String, String> registro: paises.entrySet()){
            System.out.print(registro.getKey() + " ===> ");
            System.out.println(registro.getValue());
        }
    }
}
