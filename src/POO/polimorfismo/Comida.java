package POO.polimorfismo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Comida {
    private double peso;
    private String sabor;

    public Comida(double peso, String sabor){
        setPeso(peso);
        setSabor(sabor);
    }

    public void setPeso(double peso){
        if(peso >= 0){
            this.peso = peso;
        }
    }

}
